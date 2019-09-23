package weekthree.friday.mobilebanking;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {

    String username;
    String password;
    ArrayList<User> users;
    Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        Login login = new Login();
        login.initialise();
        login.userLogin();
    }

    private void initialise() {
        Initialise init = new Initialise();
        users = init.seedData();
    }

    private void userLogin() {
        System.out.println("Please enter your username");
        username = scn.nextLine();
        System.out.println("Please enter your password");
        password = scn.nextLine();
        int counter = 1;
        for(User u : users){
            if(u.getUsername().equals(username)){
                if(u.getPassword().equals(password)){
                    openMenu(u);
                    break;
                }
            }
            else if(counter == users.size()){
                System.out.println("Incorrect username and/or password provided.");
            }
            counter++;
        }
        userLogin();
    }

    private void openMenu(User user) {
        MainMenu mm = new MainMenu(user);
    }
}