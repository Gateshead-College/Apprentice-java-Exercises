package projects.friday.mobile_banking.models;

public class Transaction {

    private String transactionDate;
    private String transactionPerson;
    private double transactionAmount;

    public Transaction(String transactionDate, String transactionPerson, double transactionAmount) {
        this.transactionDate = transactionDate;
        this.transactionPerson = transactionPerson;
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public String getTransactionperson() {
        return transactionPerson;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }
}
