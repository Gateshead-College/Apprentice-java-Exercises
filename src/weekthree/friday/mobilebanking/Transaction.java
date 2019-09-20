package weekthree.friday.mobilebanking;

public class Transaction {

    private String transactionDate;
    private String transactionperson;
    private double transactionAmount;

    public Transaction(String transactionDate, String transactionperson, double transactionAmount) {
        this.transactionDate = transactionDate;
        this.transactionperson = transactionperson;
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionperson() {
        return transactionperson;
    }

    public void setTransactionperson(String transactionperson) {
        this.transactionperson = transactionperson;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }
}
