package projects.friday.mobile_banking.views;

import projects.friday.mobile_banking.controllers.LoginController;
import projects.friday.mobile_banking.models.User;

import java.util.Scanner;


public class Login {

    //An instance variable holding our Scanner object
    Scanner scn = new Scanner(System.in);

    //Main method - starting point for the program
    public static void main(String[] args) {
        //Create a new Login object and store it in the variable 'login'
        Login login = new Login();
        //Infinite loop to keep the program running
        while(true) {
            //Using the Login object created above
            //access and call the getUserDetails method
            login.getUserDetails();
        }
    }

    //Method declaration - return type void - so nothing
    public void getUserDetails() {
        //Ask the user for their username
        System.out.println("Please enter your username");
        //Use the scanner to get the value entered and
        //store it in a new local String variable called username
        String username = scn.nextLine();
        //Ask the user for their password
        System.out.println("Please enter your password");
        //Use the scanner to get the value entered and
        //store it in a new local String variable called password
        String password = scn.nextLine();

        //Create a new LoginController object and store it in
        //a local variable called 'lc'
        LoginController lc = new LoginController();
        //Create a new local User variable called 'u' and assign to
        //it the value returned by the validateLogin method in our
        //LoginController class, using the object we created
        //called 'lc' to access and call the method.
        //We pass accross the username and password entered as the
        //validateLogin method requires these pieces of information to run.
        User u = lc.validateLogin(username, password);
        //Check to see if the value in our User object, called 'u'
        //is not null
        if(u != null){
            //If it isn't null then we will create a new
            //annonymous instance of the MainMenu class
            //and pass accross a reference to the User object
            //returned by the validateLogin method.
            new MainMenu(u);
        }
        //If the user object is null the code inside of the if
        //statement will be skipped and the else statement
        //will run instead.
        else {
            //Print out to the user that the wrong details have been entered.
            System.out.println("Invalid username / password, please try again.");
        }
    }
}
