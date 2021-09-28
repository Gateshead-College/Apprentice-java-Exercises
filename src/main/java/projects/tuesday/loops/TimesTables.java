package weekthree.tuesday.loops;

import java.util.Scanner;

public class TimesTables {

    private void getValues() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Which times table do you want?");
        int table = Integer.parseInt(scn.nextLine());
        System.out.println("What is the maximum multiplication you want?");
        int max = Integer.parseInt(scn.nextLine());
        generateTable(table, max);
    }

    private void generateTable(int table, int max) {

    }

}
