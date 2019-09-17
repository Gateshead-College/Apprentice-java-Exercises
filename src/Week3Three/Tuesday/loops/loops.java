package Week3Three.Tuesday.loops;


import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What number to times");
        int num = Integer.parseInt(sc.nextLine());
        System.out.println("How many times");
        int times = Integer.parseInt(sc.nextLine());

        for (int i = 1; i < (times ); i++) {
            System.out.println(num + " X " + i + " = " + (num * i));

        }
    }
}
