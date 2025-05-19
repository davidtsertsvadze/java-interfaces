package payment.paymenntTypes;

import payment.interfaces.Payment;

public class CashPayment implements Payment {
    @Override
    public boolean pay(double amount) {
        System.out.println("Processing Cash Payment...");
        return amount > 0;
    }

}
