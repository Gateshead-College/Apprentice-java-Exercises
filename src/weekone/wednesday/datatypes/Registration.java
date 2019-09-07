package weekone.wednesday.datatypes;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, please complete all fields to register.");
        System.out.println("What is your first name?");
        String forename = scanner.nextLine();
        System.out.println("What is your surname?");
        String surname = scanner.nextLine();
        System.out.println("How old are you?");
        byte age = Byte.parseByte(scanner.nextLine());
        System.out.println("Would you like to receive our newsletter? (y/n)");
        boolean newsletter = false;
        if(scanner.nextLine().equals("y")){
            newsletter = true;
        }

        System.out.println("Please check and confirm the details entered are correct.");
        System.out.println("Name: " + forename + " " + surname + ", " + age + " years old.");
        System.out.println("Receiving our newsletter: " + newsletter);
        System.out.println("Are these details correct?");
        if(scanner.nextLine().equals("y")){
            System.out.println("Thank you for registering, goodbye.");
        }
        else {
            System.out.println("Registration aborted, please start again");
        }
    }
}
