package weekfour.monday.payroll.models;

import java.util.Date;

public class Payment {

    private String paymentDate;
    private double paymentGross;
    private double paymentNet;
    private double paymentTax;
    private double paymentNI;

    public Payment(String paymentDate, double paymentGross) {
        this.paymentDate = paymentDate;
        this.paymentGross = paymentGross;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getPaymentGross() {
        return paymentGross;
    }

    public void setPaymentGross(double paymentGross) {
        this.paymentGross = paymentGross;
    }

    public double getPaymentNet() {
        return paymentNet;
    }

    public void setPaymentNet(double paymentNet) {
        this.paymentNet = paymentNet;
    }

    public double getPaymentTax() {
        return paymentTax;
    }

    public void setPaymentTax(double paymentTax) {
        this.paymentTax = paymentTax;
    }

    public double getPaymentNI() {
        return paymentNI;
    }

    public void setPaymentNI(double paymentNI) {
        this.paymentNI = paymentNI;
    }
}
