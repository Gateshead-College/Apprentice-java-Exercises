package weekthree.friday.mobilebanking;

import java.util.Scanner;

public class MainMenu {

    Scanner scn = new Scanner(System.in);
    private User user;

    public MainMenu(User user) {
        this.user = user;
        if (user.getAccounts().size() > 0) {
            displayMenu(user);
        } else
            newCustomer();

    }

    private void newCustomer() {
        System.out.println("Hello, welcome " + user.getForename());
        System.out.println("We see you do not currently have any accounts with us,");
        System.out.println("Would you like to open one now? (y/n)");
        String choice = scn.nextLine();
        if (choice.equalsIgnoreCase("y")) {
            //TODO openAccount();
        }
    }

    @SuppressWarnings("Duplicates")
    public void displayMenu(User user) {
        System.out.println("Hello, welcome back " + user.getForename());
        System.out.println("1 - Open a new Account");
        System.out.println("2 - View your accounts");
        System.out.println("3 - Close an Account");
        System.out.println("4 - Logout");
        System.out.println("Please select an option from the menu above");
        byte choice = Byte.parseByte(scn.nextLine());
        processChoice(choice);
    }

    private void processChoice(byte choice) {

        switch (choice) {

            case 1:
                //openAccount
                break;

            case 2:
                viewAccounts();
                break;

            case 3:
                //closeAccount
                break;

            case 4:
                //logout
                break;

            default:
                System.out.println("The value entered is not valid, please try again");
                displayMenu(user);
        }
    }

    private void viewAccounts() {
        if (user.getAccounts().size() > 1) {
            System.out.println("Please select the account you wish to access:");
            int counter = 1;
            for (Account a : user.getAccounts()) {
                System.out.println(counter + " - " + a.getAccountType() + " Account");
                counter++;
            }
            int choice = Integer.parseInt(scn.nextLine());
            accountMenu(user.getAccounts().get(choice - 1));
        } else {
            accountMenu(user.getAccounts().get(0));
        }
    }

    //Need to add a check if the user has more than one account for the transfer option.
    private void accountMenu(Account account) {
        System.out.println("Please select an option: ");
        System.out.println("1 - View account balance");
        System.out.println("2 - View transactions");
        if (user.getAccounts().size() > 1) {
            System.out.println("3 - Transfer funds between accounts");
        }
        int choice = Integer.parseInt(scn.nextLine());
    }
}