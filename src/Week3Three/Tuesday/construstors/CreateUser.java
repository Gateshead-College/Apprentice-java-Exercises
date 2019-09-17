package Week3Three.Tuesday.construstors;

import java.util.Scanner;

public class CreateUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your username");
        String username = sc.nextLine();
        System.out.println("What is your password");
        String password = sc.nextLine();
        System.out.println("What is your forename");
        String forename = sc.nextLine();
        System.out.println("What is your surname");
        String surname = sc.nextLine();
        System.out.println("What is your age");
        String age1 = sc.nextLine();
        if (age1 !=null){
            byte age;
            age = Byte.parseByte(age1);
        }
        byte age = Byte.parseByte(sc.nextLine());
        System.out.println("What is your phone");
        long phonenumber = Long.parseLong(sc.nextLine());
        System.out.println("What is your gender");
        boolean gender;
        gender = !sc.nextLine().equalsIgnoreCase("m");
        User u = new User(username ,password,phonenumber,gender);
        u.values();
    }

}
