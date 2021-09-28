package datatypes;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome, please complete all fields to register.");
        System.out.println("What is your first name?");
        String forename = myScanner.nextLine();
        System.out.println("What is your surname?");
        String surname = myScanner.nextLine();
        System.out.println("How old are you?");
        byte age = Byte.parseByte(myScanner.nextLine());
        System.out.println("Would you like to receive our newsletter? (y/n)");
        boolean newsletter;
        if (myScanner.nextLine().equalsIgnoreCase("y")) {
            newsletter = true;
        } else
            newsletter = false;

        System.out.println("Please check and confirm the details entered are correct:");
        System.out.println("Name: " + forename + " " + surname + ", " + age + " years old.");
        System.out.println("Receiving our newsletter: " + newsletter);
        System.out.println("Are these details correct?");
        if(myScanner.nextLine().equalsIgnoreCase("y")){
            System.out.println("Thanks for registering, Goodybye");
        }
        else {
            System.out.println("Registration aborted, please start again");
            main(null);
        }
    }
}
