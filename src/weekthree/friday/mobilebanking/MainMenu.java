package weekthree.friday.mobilebanking;

import java.util.ArrayList;
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
            openAccount();
        }
        else {
            newCustomer();
        }
    }

    private void openAccount() {
        System.out.println("What type of account would you like to create?");
        System.out.println("1 - Current Account");
        System.out.println("2 - Standard Savings Account");
        System.out.println("3 - ISA");
        System.out.println("4 - Credit Account");
        int choice = Integer.parseInt(scn.nextLine());
        String accType = "";

        switch(choice){
            case 1:
              accType = "Current";
              break;

            case 2:
                accType = "Standard Savings";
                break;

            case 3:
                accType = "ISA";

            case 4:
                accType = "Credit";
                break;

            default:
                System.out.println("Invalid option provided, please try again");
                openAccount();

        }
        double initialBalance = 0;
        System.out.println("Would you like to make an initial deposit to your new account? (y/n)");
        String response = scn.nextLine();
        if(response.equalsIgnoreCase("y")){
            System.out.println("How much would you like to deposit?");
            initialBalance = Double.parseDouble(scn.nextLine());
        }
        ArrayList<Account> accounts = user.getAccounts();
        accounts.add(new Account(user.getAccounts().size() + 1, initialBalance, accType));
        user.setAccounts(accounts);
        displayMenu(user);
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
                openAccount();
                break;

            case 2:
                viewAccounts();
                break;

            case 3:
                closeAccount();
                break;

            case 4:
                logout();
                break;

            default:
                System.out.println("The value entered is not valid, please try again");
                displayMenu(user);
        }
    }

    private void logout() {
        Login.main(null);
    }

    private void closeAccount() {
        System.out.println("Sorry to hear you would like to close your account");
        Account accountToClose;
        if(user.getAccounts().size() > 1) {
            System.out.println("Please select from the list below the account you would like to close:");
            int counter = 1;
            for (Account a : user.getAccounts()) {
                System.out.println(counter + " - " + a.getAccountType() + " account, Account Balance: " + a.getAccountBalance());
                counter++;
            }
            int choice = Integer.parseInt(scn.nextLine());
            accountToClose = user.getAccounts().get(choice - 1);
        }
        else {
            accountToClose = user.getAccounts().get(0);
        }
        if(accountToClose.getAccountBalance() > 0){
            System.out.println("This account currently has a balance of " + accountToClose.getAccountBalance());
            System.out.println("Are you sure you want to close it? Any money in the account will be lost(y/n)");
            String choice = scn.nextLine();
            if(choice.equalsIgnoreCase("y")){
                ArrayList<Account> accs = user.getAccounts();
                accs.remove(accountToClose);
                user.setAccounts(accs);
            }
            System.out.println("Account has been closed");
            if(user.getAccounts().size() > 0){
                displayMenu(user);
            }
            else {
                newCustomer();
            }
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
        System.out.println("0 - Return to previous menu");

        int choice = Integer.parseInt(scn.nextLine());
        switch(choice){
            case 1:
                viewBalance(account);
                break;

            case 2:
                viewTransactions(account);
                break;

            case 3:
                transferFunds(account);
                break;

            case 0:
                displayMenu(user);
                break;

            default:
                System.out.println("Invalid option provided, please try again");
                accountMenu(account);
        }
    }

    private void transferFunds(Account account) {
        Account destinationAccount;
        ArrayList<Account> availableAccounts = user.getAccounts();
        availableAccounts.remove(account);
        if(user.getAccounts().size() > 2){
            System.out.println("Please select the account you wish to send money too from the list below:");
            int counter = 1;
            for(Account a : user.getAccounts()){
                    System.out.println(counter + " - " + a.getAccountType() + " account");
            }
            int choice = Integer.parseInt(scn.nextLine());
            destinationAccount = availableAccounts.get(choice - 1);
        }
        else {
            destinationAccount = availableAccounts.get(0);
        }
        System.out.println("How much would you like to transfer?");
        double amount = Double.parseDouble(scn.nextLine());
        if(amount <= account.getAccountBalance()){
            account.setAccountBalance(account.getAccountBalance() - amount);
            destinationAccount.setAccountBalance(destinationAccount.getAccountBalance() + amount);
            System.out.println("Successfully transferred £" + amount + " from " + account.getAccountType() + " account to " +
                    destinationAccount.getAccountType() + " account");
            accountMenu(account);
        }
        else {
            System.out.println("Insufficient funds to complete transfer");
            accountMenu(account);
        }
    }

    private void viewTransactions(Account a) {
        if(a.getTransactions().size() > 0){
            for(Transaction t : a.getTransactions()){
                System.out.println(t.getTransactionDate() + "    " +
                        t.getTransactionperson() + "    "  +
                        t.getTransactionAmount());
            }
        }
        else
        {
            System.out.println("No transaction history to show!");
            accountMenu(a);
        }
    }

    private void viewBalance(Account account) {
        System.out.println("Account: " + account.getAccountType() + "\n" +
                            "Account Number: " + account.getAccountNumber() + "\n" +
                            "Account Balance: £" + account.getAccountBalance());

        accountMenu(account);
    }
}