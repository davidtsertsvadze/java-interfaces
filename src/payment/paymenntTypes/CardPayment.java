package payment.paymenntTypes;

import payment.interfaces.Payment;

public class CardPayment implements Payment {
    @Override
    public boolean pay(double amount) {
        System.out.println("Processing Card Payment...");
        return amount > 0;
    }

}
