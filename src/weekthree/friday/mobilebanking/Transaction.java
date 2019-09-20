package weekthree.friday.mobilebanking;

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

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionperson() {
        return transactionPerson;
    }

    public void setTransactionperson(String transactionperson) {
        this.transactionPerson = transactionperson;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }
}
