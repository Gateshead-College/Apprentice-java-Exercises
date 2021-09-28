package projects.friday.mobile_banking.views;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountActionsMenu {

    public static int menu() {
        System.out.println("1 - View Balance");
        System.out.println("2 - View Transactions");
        System.out.println("3 - Make Transfer");
        System.out.println("4 - Rename Account");
        System.out.println("5 - Close Account");
        //get the choice from the user
        return Integer.parseInt(new Scanner(System.in).nextLine());
    }

    //View Balance
    public static void viewBalance(double balance) {
        //In here we will print out the balance in a pretty way
        System.out.println(balance);
    }


    //View Transactions

    //Make Transfer
    public static byte getDestinationAccount(ArrayList<String> accNames) {
        System.out.println("Please select the destination account:");
        for(String s : accNames){
            System.out.println(accNames.indexOf(s) + 1 + " - " + s);
        }
        return (byte) (Byte.parseByte(new Scanner(System.in).nextLine()) - 1);
    }

    //How much do they want to transfer?
    public static double getTransferAmount(){
        System.out.println("How much would you like to transfer?");
        return Double.parseDouble(new Scanner(System.in).nextLine());
    }

    public static void displayTransactions(ArrayList<String> transactions) {
        System.out.println("Please see all transactions listed below:");
        for(String s : transactions){
            System.out.println(s);
        }
    }

    //Close Account

    //Change account name

}


