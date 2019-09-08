package weekone.friday.animals;

import java.util.Scanner;

public class CreateAnimal {

    private Scanner scn = new Scanner(System.in);

    private void getAnimalType() {
        System.out.println("What animal would you like to create?");
        String animal = scn.nextLine();

        /*switch(expression){
            //case statements
            //values must be of same type as expression
            case value1:
                //statements
                break; //break is optional

            case value2:
                //statements
                break; //optional

            // We can have any number of case statements
            // below is default statement, used when none of the cases is true.
            // No break is needed in the default case.
            default :
                // Statements
                //No break required
        }*/


        switch(animal.toLowerCase()){

            case "dog":
                createDog();
                break;

            case "cat":
                createCat();
                break;

            case "hamster":
                createHamster();
                break;

            case "fish":
                createFish();
                break;

            default:
                System.out.println(animal + " is not a type of animal we can currently create, please try again");
        }
    }

    private void createFish() {

    }

    private void createHamster() {

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
