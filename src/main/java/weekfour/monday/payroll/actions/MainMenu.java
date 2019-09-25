package weekfour.monday.payroll.actions;

import weekfour.monday.payroll.models.Employee;

import java.util.ArrayList;

public class MainMenu {

    ArrayList<Employee> allEmps;
    Employee emp;

    public MainMenu(ArrayList<Employee> emps, Employee emp) {
        this.allEmps = emps;
        this.emp = emp;
        printMenu();
    }

    private void printMenu() {
        System.out.println("Hello " + emp.getEmployeeForename() + ", welcome back.");
        System.out.println("Please select an option from the menu below:");
        System.out.println("1 - ");
        System.out.println("2 - ");
        System.out.println("3 - ");
        System.out.println("4 - ");
        System.out.println("5 - ");
        System.out.println("6 - ");
        System.out.println("7 - ");
        System.out.println("8 - ");
    }

}