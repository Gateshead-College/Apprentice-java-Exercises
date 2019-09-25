package weekone.wednesday.songs;

import java.awt.*;
import java.util.Scanner;

public class BottleSong {

    Scanner myScanner = new Scanner(System.in);

    private void sing(){
        System.out.println("How many bottles of beer are there on the wall?");
        int bottles = Integer.parseInt(myScanner.nextLine()); //Don't use 'NextInt', causes problems with next read

        String word = "bottles";
        for(int i = bottles; i > 0; i--){
            System.out.println(i + " " + word + " of beer on the wall,");
            System.out.println(i + " " + word + " of beer.");
            System.out.println("Take one down,");
            System.out.println("Pass it around,");
            if(i == 1){
                System.out.println("No more bottles of beer on the wall.");
            }
            else {
                int newNum = i - 1;
                if(newNum == 1){
                    word = "bottle";
                }
                System.out.println(newNum + " " + word + " of beer on the wall.");
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        BottleSong bottleSong = new BottleSong();
        bottleSong.sing();
    }

}