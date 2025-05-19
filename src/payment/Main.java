package payment;

import payment.interfaces.Payment;
import payment.logs.LoggerUtil;
import payment.paymenntTypes.CardPayment;
import payment.paymenntTypes.CashPayment;
import payment.paymenntTypes.VoucherPayment;
import payment.transactions.Transactions;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final List<Transactions> transactionHistory = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("შეიყვანე გადასახდელი თანხა: ");
        double amount = scanner.nextDouble();

        System.out.println("აირჩიე გადახსიდ მეთოდი (1 = ბარათი, 2 = ნაღდი, 3 = ვაუჩერი): ");
        String choice = scanner.next();

        Payment paymentMethod = switch (choice) {
            case "1" -> new CardPayment();
            case "2" -> new CashPayment();
            case "3" -> new VoucherPayment();
            default -> null;
        };
        if(paymentMethod == null) {
            System.out.println("არასწორი გადახდის მეთოდი!");
        }

        boolean success = paymentMethod.pay(amount);
        String type = paymentMethod.getClass().getSimpleName();
        
        if(success) {
            Transactions transaction = new Transactions(amount,type);
            transactionHistory.add(transaction);
            LoggerUtil.log("SUCCESS" + transaction);
            System.out.println("გადახდა წარმატებით შესრულდა!");
            System.out.println(transaction);
        } else {
            LoggerUtil.log("FAILED: გადახდა ვერ შესრულდა - " + type + ", თანხა: " + amount);
            System.out.println("გადახდა ვერ შესრულდა.");
        }

        System.out.println("\n შესრულებული ტრანზაქციების ისტორია:");
        for (Transactions t : transactionHistory) {
            System.out.println(t);
        }

        scanner.close();
    }
}
