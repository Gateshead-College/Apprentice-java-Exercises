package weekfour.monday.payroll;

import weekfour.monday.payroll.actions.Initialise;
import weekfour.monday.payroll.actions.MainMenu;
import weekfour.monday.payroll.models.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {

    Scanner scn = new Scanner(System.in);
    ArrayList<Employee> emps;


    public static void main(String[] args) {
        Login login = new Login();
        login.initialise();
        login.userLogin();
    }

    private void userLogin() {
        System.out.println("Enter your Username:");
        String UN = scn.nextLine();
        System.out.println("Enter your password");
        String PW = scn.nextLine();

        int counter = 1;
        for(Employee e : emps){
            if(UN.equalsIgnoreCase(e.getUsername()) && PW.equals(e.getPassword())){
                displayMenu(e);
                counter++;
            }
            else if(counter == emps.size()){
                System.out.println("Incorrect Username and/or Password provided");
            }
        }
    }

    private void displayMenu(Employee emp) {
        MainMenu mm = new MainMenu(emps, emp);
    }

    private void initialise() {
        Initialise init = new Initialise();
        emps = init.seedData();
    }


}
