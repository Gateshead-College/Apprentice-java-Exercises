package weekone.wednesday.meinehunde;

import java.util.ArrayList;
import java.util.Scanner;

public class Dogomatic3000 {

    ArrayList<Dog> dogs = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Dogomatic3000 dogomatic3000 = new Dogomatic3000();
        int x = 0;
        while(x < 3){
            dogomatic3000.playGod();
            x++;
        }
        System.out.println("This is where we will hot the breakpoint.");
        System.out.println("This will allow us to inspect our code as it is running.");
    }

    private void playGod(){
        System.out.println("Hello, I am the Dogomatic 3000.");
        System.out.println("What type of dog would you like to create today?");
        String breed = scanner.nextLine();
        System.out.println("Very well, and how old should it be?");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Ok, no problem at all.");
        System.out.println("And what will you call your new furry friend?");
        String name = scanner.nextLine();
        System.out.println("One moment please");
        Dog dog = new Dog();
        dog.name = name;
        dog.breed = breed;
        dog.age = age;
        dogs.add(dog);
        System.out.println("Congratulations, your new dog is ready, bye bye!");
    }


}
