package Week2Two.tuesday.banking;

import java.util.Scanner;

public class logIn {
    Scanner sc = new Scanner(System.in);
    String user;

    public void login() throws InterruptedException {

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
        logIn lg = new logIn();
        user = sc.nextLine();
        Accounts acc = new Accounts();
        String pass = acc.UserValid(user);
        if (pass.equals("Incorrect")) {
            for (int i = 0; i < 50; ++i) System.out.println();
            lg.incorrect();
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
                lg.incorrect();
            }
        }


    }


    public void incorrect() throws InterruptedException {
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
        logIn lg = new logIn();
        lg.login();
    }


}

