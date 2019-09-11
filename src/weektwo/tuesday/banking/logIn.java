package weektwo.tuesday.banking;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class logIn {

    String user;
    String pass;
    User[] users = new User[10];
    Scanner sc = new Scanner(System.in);

    public void userLogin() {
        System.out.println("Enter you username! ");
        user = sc.nextLine();
        System.out.println("Enter you password! ");
        pass = sc.nextLine();
        if (user.equalsIgnoreCase("kieran")) {
            if (pass.equals("Nice")) {
                MainMenu mm = new MainMenu();
                mm.mainMenu();
            }
        }

        System.out.println("Incorrect username/password");

    }
}
