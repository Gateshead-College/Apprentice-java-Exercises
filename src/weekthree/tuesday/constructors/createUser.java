package weekthree.tuesday.constructors;

import javax.swing.*;
import java.util.Scanner;

public class createUser {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter your username:");
        String UN = scn.nextLine();
        System.out.println("Please enter your password:");
        String PW = scn.nextLine();
        System.out.println("Please enter your age:");
        String line = scn.nextLine();
        byte age = 0;
        if(!line.equals("")){
            age = Byte.parseByte(line);
        }
        System.out.println("Please enter your forename:");
        String FN = scn.nextLine();
        System.out.println("Please enter your surname:");
        String SN = scn.nextLine();
        System.out.println("Please enter your Phone Number:");
        long PN = Long.parseLong(scn.nextLine());
        System.out.println("Please enter your gender:");
        boolean gender;
        if(scn.nextLine().equalsIgnoreCase("m")){
            gender = false;
        }
        else {
            gender = true;
        }
        if(age > 0){
            User u = new User (UN, PW, age, PN, gender);
            System.out.println(u.returnData());
        }
        else {
            User u = new User (UN, PW, PN, gender);
            System.out.println(u.returnData());
        }
        JOptionPane.showMessageDialog(null, "akhgk");

    }

}
