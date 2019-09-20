package weekthree.friday.mobilebanking;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {

    String username;
    String password;
    ArrayList<User> users;
    Scanner scn = new Scanner(System.in);

    public Login(ArrayList<User> users) {
        this.users = users;
    }

    public static void main(String[] args) {

        Login login = new Login();
        login.userLogin();
    }

    private void initialise(){
        Initialise init = new Initialise(users);
    }

    private void userLogin(){
        System.out.println("Please enter your username");
        username = scn.nextLine();
        System.out.println("Please enter your password");
        password = scn.nextLine();
        if(username.equals("Deano")) {
            if(password.equals("5trongP@ssword")) {
                openMenu();
                return;
            }
        }
        else {
            System.out.println("Incorrect username and/or password provided");
        }
        userLogin();
    }

    private void openMenu() {
        MainMenu mm = new MainMenu();
        mm.user = username;
        mm.displayMenu();
    }
}