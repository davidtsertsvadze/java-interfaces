package payment.transactions;

import java.util.UUID;
import payment.interfaces.Payment;

public class Transactions {
    private final double amount;
    private final String paymentType;
    private final String transactionID;

    public Transactions(double amount, String paymentType) {
        this.amount = amount;
        this.paymentType = paymentType;
        this.transactionID = UUID.randomUUID().toString();
    }

    public String getTransactionID() {
        return transactionID;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Transactions ID: " + transactionID + ", Payment Type: " + paymentType + ", Amount: " + amount;
    }
}
