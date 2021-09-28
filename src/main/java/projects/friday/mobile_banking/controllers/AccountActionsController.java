package projects.friday.mobile_banking.controllers;

import org.joda.time.DateTime;
import projects.friday.mobile_banking.models.Account;
import projects.friday.mobile_banking.models.Transaction;
import projects.friday.mobile_banking.models.User;
import projects.friday.mobile_banking.views.AccountActionsMenu;
import projects.friday.mobile_banking.views.AccountMenu;

import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
public class AccountActionsController {

    public static User currentUser;

    //open a new account
    public static boolean createAccount(User u) {
        String accType = AccountMenu.openAccountGetType();
        double initialBalance = AccountMenu.openAccountInitialDeposit();
        String accName = AccountMenu.openAccountGetName();
        if(accName == null){
            accName = accType;
        }
        u.addAccount(new Account(accName, initialBalance, accType));

        return true;
    }

    /**
     * General description of the method
     * @param accList - ArrayList<Account> Used to generate a list of all accounts the user holds
     */
    public static void viewAccounts(ArrayList<Account> accList) {
        //Create a new String array variable and initialise it with a new String Array with
        //a size equal to the size of the accList passed into this method.
        String[] accountNames = new String[accList.size()];

        /*for each account in the list accList we want to get the name of the account
        and put it into the array accountNames.*/

        //this is a for loop which checks every element within the accList List.
        //a is a variable and its datatype is Account
        //Every time this loops the next element in the list is assigned to a.
        for (Account a : accList) {

            //using the variable a which holds an account, get the name of that account using the get function.
            //assign the name of the account to the index of the accountNames array specified.
            //The index we will target is determined by the index of the account object
            //stored in 'a' within the accList list.
            accountNames[accList.indexOf(a)] = a.getAccountName();
        }

        //We create a new int variable called accountSelected
        //We assign to that variable the value returned by displayAccounts - 1
        //Display Accounts will return the number the user enetered for the menu choice they mande.
        //we need to subtract 1 so we can get the correct index.
        int accountSelected = AccountMenu.displayAccounts(accountNames) - 1;

        //gets the account at the index of the accList we got from the previous step
        //and stores it in a new Account variable called selectedAccount.
        Account selectedAccount = accList.get(accountSelected);

        //NEW CODE STARTS FROM HERE

        //We need to go to the AccountActionsMenu from here
        switch(AccountActionsMenu.menu()){
            case 1: AccountActionsMenu.viewBalance(selectedAccount.getAccountBalance());
            break;

            case 2: viewTransactions(selectedAccount);
                break;

            case 3: if(transferFunds(selectedAccount)){
                System.out.println("Transfer successful");
            }
            else{
                System.out.println("Transfer failed, please try again");
            }
                break;

            case 4: //Rename Account
                break;

            case 5: //Close Account
                break;
        }
    }

    private static void viewTransactions(Account selectedAccount) {
        ArrayList<String> transactions = new ArrayList<>();
        for(Transaction t : selectedAccount.getTransactions()){
            transactions.add(t.toString());
        }
        AccountActionsMenu.displayTransactions(transactions);
    }

    public static boolean transferFunds(Account sourceAccount){
        //get destination account
        ArrayList<String> accNames = new ArrayList<>();
        int sourceIndex = 0;
        for(Account a : currentUser.getAccounts()){
            if(!a.equals(sourceAccount)){
                accNames.add(a.getAccountName());
            }
            else {
                sourceIndex = accNames.size();
            }
        }
        int accIndex = AccountActionsMenu.getDestinationAccount(accNames);
        Account destinationAccount;
        if(accIndex < sourceIndex){
            destinationAccount = currentUser.getAccounts().get(accIndex);
        }
        else{
            destinationAccount = currentUser.getAccounts().get(accIndex + 1);
        }
        double amount = AccountActionsMenu.getTransferAmount();
        if(sourceAccount.getAccountBalance() >= amount){
            //they have enough wonga
            sourceAccount.setAccountBalance(sourceAccount.getAccountBalance() - amount);
            sourceAccount.addTransaction(new Transaction(LocalDate.now(), destinationAccount.getAccountName(),
                    amount * -1, sourceAccount.getAccountBalance()));
            destinationAccount.setAccountBalance(destinationAccount.getAccountBalance() + amount);
            destinationAccount.addTransaction(new Transaction(LocalDate.now(), sourceAccount.getAccountName(),
                    amount, destinationAccount.getAccountBalance()));
            return true;
        }
        else {
            //you dont have enough money!
            return false;
        }
    }
}

        //Account selectedAccount = accList.get(AccountMenu.displayAccountsReturn(accountNames) - 1);
    //}
//}
