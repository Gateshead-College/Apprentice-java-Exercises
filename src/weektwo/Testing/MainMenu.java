package weektwo.Testing;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {
    Scanner sc = new Scanner(System.in);
    String user;

    public void mainMenu(String user) {
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
                    openAccount openAcc = new openAccount();
                    openAcc.openAcc(user);
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


    public static void main(String[] args) throws InterruptedException {
        logIn lg = new logIn();
        lg.login();
    }

}
