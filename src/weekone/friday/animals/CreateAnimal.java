package weekone.friday.animals;
// Import the scanner to use it
import javax.security.auth.login.CredentialException;
import java.util.Scanner;

public class CreateAnimal {

    Scanner sc = new Scanner(System.in);

    private void getAnimalType() {
        System.out.println("What animal would you like to create? (Cat, Dog, Fish or Penguin");
        String animal = sc.nextLine();

        switch(animal.toLowerCase()) {

            case "dog":
                createDog();
                break;

            case "cat":
                createCat();
                break;

            case "fish":
                createCat();
                break;

            case "penguin":
                createCat();
                break;


            default:
                System.out.println(animal + " is not supported at the moment, we can currently make a Cat or a Dog!");
        }

    }

    private void createDog(){
        System.out.println("What is the dogs name?");
        String name = sc.nextLine();
        System.out.println("How big is the dog? (Small, Medium Or Large)");
        String size = sc.nextLine();
        System.out.println("How old is the dog?");
        int age = sc.nextInt();
        System.out.println("What breed is the dog? (Poodle, Labrador or Border Collie)");
        String breed = sc.next();
        Dog myDog = new Dog(name, size, breed, age);

        System.out.println("Your Cat is called "+name);
        System.out.println("Your Dog Is "+myDog.status(age));
        System.out.println("Your Dog Says "+myDog.bark(size));
        System.out.println("Dog_Playing = "+myDog.play(breed));


    }
    private void createCat(){
        System.out.println("What is the cats name?");
        String name = sc.nextLine();
        System.out.println("How big is the cat? (Small, Medium Or Large)");
        String size = sc.nextLine();
        System.out.println("How old is the cat?");
        int age = sc.nextInt();
        System.out.println("What breed is the cat? (Sphynx, Siamese or House");
        String breed = sc.next();
        Cat myCat = new Cat(name, size, breed, age);

        System.out.println("Your Cat is called "+name);
        System.out.println("Your Cat Is "+myCat.status(age));
        System.out.println("Your Cat Says "+myCat.meow(size));
        System.out.println("Cat_Playing= "+myCat.play(breed));


    }



    public static void main(String[] args) {
        CreateAnimal createAnimal = new CreateAnimal();

        createAnimal.getAnimalType();
    }

}