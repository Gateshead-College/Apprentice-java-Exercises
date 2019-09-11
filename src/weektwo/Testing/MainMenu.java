package weektwo.Testing;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {
    Scanner sc = new Scanner(System.in);
    String user;

    private void logIn() throws InterruptedException {
        for (int i = 0; i < 50; ++i) System.out.println();
        System.out.println("////////////////////////////////////////");
        System.out.println("/ Welcome to the mobile bank of Kieran /");
        System.out.println("/                                      /");
        System.out.println("/   Please log in to your account!     /");
        System.out.println("/                                      /");
        System.out.println("/       What is your username?         /");
        System.out.println("/                                      /");
        System.out.println("/                                      /");
        System.out.println("////////////////////////////////////////");
        MainMenu mm = new MainMenu();
        user = sc.nextLine();
        Accounts acc = new Accounts();
        String pass = acc.UserValid(user);
        if (pass.equals("Incorrect")) {
            for (int i = 0; i < 50; ++i) System.out.println();
            mm.incorrect();
        } else {


            for (int i = 0; i < 50; ++i) System.out.println();
            System.out.println("////////////////////////////////////////");
            System.out.println("/                                      /");
            System.out.println("/                                      /");
            System.out.println("/           Username Correct           /");
            System.out.println("/                                      /");
            System.out.println("/        What is your password?        /");
            System.out.println("/            Case Sensitive            /");
            System.out.println("/                                      /");
            System.out.println("////////////////////////////////////////");
            String uPass = sc.nextLine();

            if (uPass.equals(pass)) {
                for (int i = 0; i < 50; ++i) System.out.println();
                System.out.println("/////////////////////////////////////////");
                System.out.println("/                                       /");
                System.out.println("/                                       /");
                System.out.println("/            Password Correct           /");
                System.out.println("/                                       /");
                System.out.println("/           You have logged in          /");
                System.out.println("/                                       /");
                System.out.println("/                                       /");
                System.out.println("/////////////////////////////////////////");
                System.out.println(user);
                Thread.sleep(2000);
                mm.mainMenu(user);

            } else {
                mm.incorrect();
            }
        }


    }


    private void mainMenu(String user) {
        for (int i = 0; i < 50; ++i) System.out.println();
        System.out.println("////////////////////////////////////////");
        System.out.println("/ Welcome " + user + " to Ingram Bank    /");
        System.out.println("/                                      /");
        System.out.println("/ Do you wish to:                      /");
        System.out.println("/ 1. View your account                 /");
        System.out.println("/ 2. Open a new account                /");
        System.out.println("/ 3. Close an account                  /");
        System.out.println("/ 4. Log out                           /");
        System.out.println("////////////////////////////////////////");
        try {
            int mmChoice = sc.nextInt();


            switch (mmChoice) {

                case 1:
//                viewAccount();
                    break;
                case 2:
//                openAccount();
                    break;

                case 3:
//                closeAccount();
                    break;

                case 4:
//                logOut();
                    break;

                default:
                    MainMenu mainmenu = new MainMenu();
                    System.out.println("Please select 1, 2, 3, or 4!!");
                    for (int i = 0; i < 50; ++i) System.out.println();
                    mainmenu.mainMenu(user);
            }
        } catch (InputMismatchException e) {
            MainMenu mainmenu = new MainMenu();
            System.out.println("Please select 1, 2, 3, or 4!!");
            for (int i = 0; i < 50; ++i) System.out.println();
            mainmenu.mainMenu(user);
        }

    }

    private void incorrect() throws InterruptedException {
        for (int i = 0; i < 50; ++i) System.out.println();
        System.out.println("/////////////////////////////////////////");
        System.out.println("/                                       /");
        System.out.println("/                                       /");
        System.out.println("/              INCORRECT                /");
        System.out.println("/           PLEASE TRY AGAIN            /");
        System.out.println("/                                       /");
        System.out.println("/                                       /");
        System.out.println("/                                       /");
        System.out.println("/////////////////////////////////////////");
        Thread.sleep(2000);
        MainMenu mm = new MainMenu();
        mm.logIn();
    }


    public static void main(String[] args) throws InterruptedException {
        MainMenu mm = new MainMenu();
        mm.logIn();
    }

}
