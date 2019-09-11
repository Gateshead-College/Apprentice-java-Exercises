package weektwo.tuesday.banking;

import javafx.scene.chart.ScatterChart;

import java.beans.Expression;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {
    Scanner sc = new Scanner(System.in);

    private void logIn() {


    }

    private void mainMenu() {
        System.out.println("////////////////////////////////////////");
        System.out.println("/ Welcome to the mobile bank of Kieran /");
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
                    mainmenu.mainMenu();
            }
        } catch (InputMismatchException e) {
            MainMenu mainmenu = new MainMenu();
            System.out.println("Please select 1, 2, 3, or 4!!");
            mainmenu.mainMenu();
        }

    }

    public static void main(String[] args) {
        MainMenu mainmenu = new MainMenu();
        mainmenu.mainMenu();
    }
}
