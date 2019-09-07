package weekone.friday.animals;

import java.util.Scanner;

public class CreateAnimal {

    private Scanner scn = new Scanner(System.in);

    private void getAnimalType() {
        System.out.println("What animal would you like to create?");
        String animal = scn.nextLine();
        if(animal.equalsIgnoreCase("dog")){
            createDog();
        }
        else if (animal.equalsIgnoreCase("cat")) {
            createCat();
        }
        else {
            System.out.println(animal + " is not an animal we can currently create, please try again.");
        }
    }

    private void createCat() {
        System.out.println("What is the cats name?");
        String name = scn.nextLine();
        System.out.println("How old is the cat?");
        byte age = Byte.parseByte(scn.nextLine());
        System.out.println("What is the cats nature?");
        String nature = scn.nextLine();
        Cat myCat = new Cat(name, age, nature);

        System.out.println(myCat.stroke(age));
        System.out.println(myCat.speak(name));

        getAnimalType();
    }

    private void createDog() {
        System.out.println("What is the name of the dog?");
        String name = scn.nextLine();
        System.out.println("How big is the dog?");
        String size = scn.nextLine();
        System.out.println("How old is the dog?");
        byte age = Byte.parseByte(scn.nextLine());
        System.out.println("What breed is the dog?");
        String breed = scn.nextLine();
        Dog myDog = new Dog(name, size, age, breed);

        myDog.bark(size);
        myDog.play(breed);
        myDog.beHuman(name, age, breed);

        getAnimalType();
    }

}
