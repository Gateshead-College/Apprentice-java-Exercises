package weekthree.friday.mobilebanking;

import java.util.Scanner;

public class MainMenu {

    String user;
    Scanner scn = new Scanner(System.in);

    public void displayMenu() {
        //greet the user (use the name from the logged in user object)
        System.out.println("Hello, welcome back " + user);
        //display all of the menu options
        System.out.println("1 - Open a new Account");
        System.out.println("2 - View your accounts");
        System.out.println("3 - Close an Account");
        System.out.println("4 - Logout");
        //ask the user to select an option
        System.out.println("Please select an option from the menu above");
        //get the user input
        byte choice = Byte.parseByte(scn.nextLine());
        //menuChoice()
        processChoice(choice);
    }

    private void processChoice(byte choice) {

        switch(choice){

            case 1:
                //openAccount
                break;

            case 2:
                //viewAccounts
                break;

            case 3:
                //closeAccount
                break;

            case 4:
                //logout
                break;

            default:
                System.out.println("The value entered is not valid, please try again");
                displayMenu();
        }
    }

    /*
    variable to hold user choice
    variable to hold logged in user object
    new scanner object
     */

    //display menu -->




    //menu choice -->

    //switch over the choices available using the users choice variable

    //case n:

    //complete relevant action

    //break

    //default
}