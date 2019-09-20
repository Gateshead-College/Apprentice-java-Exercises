package weekthree.friday.mobilebanking;

import java.util.Scanner;

public class Login {

    /*
    store the username entered by the user
    store the password entered by the user
    collection of User objects (All users)
    new scanner object
     */
    String username;
    String password;
    User[] users = new User[10];
    Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        Login login = new Login();
        login.userLogin();
    }

    private void userLogin(){
        //Ask user for their username
        System.out.println("Please enter your username");
        //store username entered in username variable
        username = scn.nextLine();
        //Ask the user for their password
        System.out.println("Please enter your password");
        //store the password in the password variable
        password = scn.nextLine();
        //Check the username against each of the --> cont...
        //User objects until there is a match
        //if there is a match
        if(username.equals("Deano")) {
            //Check if the password entered matches the password
            //tied to the account with the username
            if(password.equals("5trongP@ssword")) {
                openMenu();
                return;
            }
        }
        else {
            System.out.println("Incorrect username and/or password provided");
        }
        //userLogin - Rerun method
        userLogin();
    }

    private void openMenu() {
        //create a new instance of the MainMenu class
        MainMenu mm = new MainMenu();
        mm.user = username;
        //call method from MainMenu that displays the menu
        mm.displayMenu();
    }


    //open menu -->



}