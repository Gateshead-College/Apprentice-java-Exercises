package weekfour.monday.payroll;

import java.util.Date;

public class Payment {

    private Date paymentDate;
    private double paymentGross;
    private double paymentNet;
    private double paymentTax;
    private double paymentNI;

    public Payment(Date paymentDate, double paymentGross, double paymentNet, double paymentTax, double paymentNI) {
        this.paymentDate = paymentDate;
        this.paymentGross = paymentGross;
        this.paymentNet = paymentNet;
        this.paymentTax = paymentTax;
        this.paymentNI = paymentNI;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
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
