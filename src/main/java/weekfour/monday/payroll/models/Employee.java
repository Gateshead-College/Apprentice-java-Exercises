package weekfour.monday.payroll.models;

import java.util.ArrayList;

public class Employee {

    private String employeeForename;
    private String employeeSurname;
    private String employeePosition;
    private double employeeRateOfPay;
    private int contractedHours;
    private int holidayEntitlement;
    private ArrayList<Payment> payments;
    private ArrayList<Holiday> holidays;
    private String username;

    public boolean isAdmin() {
        return isAdmin;
    }

    public float getRateOfPay() {
        return rateOfPay;
    }

    private String password;
    private boolean isAdmin;
    private float rateOfPay;


    public Employee(String employeeForename, String employeeSurname, String employeePosition, int contractedHours, String username, String password) {
        this.employeeForename = employeeForename;
        this.employeeSurname = employeeSurname;
        this.employeePosition = employeePosition;
        this.contractedHours = contractedHours;
        this.username = username;
        this.password = password;
        payments = new ArrayList<>();
        holidays = new ArrayList<>();

        switch (employeePosition.toLowerCase()){
            case "md":
                isAdmin = true;
                rateOfPay = 50.08f;
                break;
            case "hr":
                isAdmin = true;
                rateOfPay = 25.12f;
                break;
            case "pr":
                isAdmin = true;
                rateOfPay = 17.43f;
                break;
            default:
                isAdmin = false;
                rateOfPay = 12.87f;
        }

        if(contractedHours <= 20){
            holidayEntitlement = 10;
        }
        else if(contractedHours > 20 && contractedHours <= 30){
            holidayEntitlement = 15;
        }
        else {
            holidayEntitlement = 20;
        }
    }

    public String getEmployeeForename() {
        return employeeForename;
    }

    public void setEmployeeForename(String employeeForename) {
        this.employeeForename = employeeForename;
    }

    public String getEmployeeSurname() {
        return employeeSurname;
    }

    public void setEmployeeSurname(String employeeSurname) {
        this.employeeSurname = employeeSurname;
    }

    public String getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(String employeePosition) {
        this.employeePosition = employeePosition;
    }

    public double getEmployeeRateOfPay() {
        return employeeRateOfPay;
    }

    public void setEmployeeRateOfPay(double employeeRateOfPay) {
        this.employeeRateOfPay = employeeRateOfPay;
    }

    public int getContractedHours() {
        return contractedHours;
    }

    public void setContractedHours(int contractedHours) {
        this.contractedHours = contractedHours;
    }

    public int getHolidayEntitlement() {
        return holidayEntitlement;
    }

    public void setHolidayEntitlement(int holidayEntitlement) {
        this.holidayEntitlement = holidayEntitlement;
    }

    public ArrayList<Payment> getPayments() {
        return payments;
    }

    public void setPayments(ArrayList<Payment> payments) {
        this.payments = payments;
    }

    public ArrayList<Holiday> getHolidays() {
        return holidays;
    }

    public void setHolidays(ArrayList<Holiday> holidays) {
        this.holidays = holidays;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
