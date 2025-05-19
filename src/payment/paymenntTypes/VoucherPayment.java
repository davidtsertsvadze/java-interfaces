package payment.paymenntTypes;

import payment.interfaces.Payment;

public class VoucherPayment implements Payment {
    @Override
    public boolean pay(double amount) {
        System.out.println("Processing Voucher Payment...");
        return amount > 0;
    }

}
