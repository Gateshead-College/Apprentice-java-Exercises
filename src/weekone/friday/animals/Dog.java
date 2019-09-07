package weekone.friday.animals;

public class Dog {

    private String name;
    private String size;
    private byte age;
    private String breed;

    public Dog(String name, String size, byte age, String breed) {
        this.name = name;
        this.size = size;
        this.age = age;
        this.breed = breed;
    }

    public String bark(String size){ //Initially private to demonstrate access modifiers.
        String bark;
        if(size.equalsIgnoreCase("small")){
            bark = "yap yap yap";
        }
        else if(size.equalsIgnoreCase("medium")){
            bark = "woof woof";
        }
        else {
            bark = "WOOF WOOF";
        }
        return bark;
    }

    public String play(String breed) {
        String playing = ""; //Has to be initialised as we aren't assigning a value in every potential path
        if(breed.equalsIgnoreCase("Poodle")){
            playing = "Oh Dear, I don't think so, one could not possibly engage in such activities";
        } else if (breed.equalsIgnoreCase("Labrador")) {
            playing = "Yeah, Yeah, Throw the stick!, Yeah, DO IT!";
        }
        else if(breed.equalsIgnoreCase("Border Collie")){
            playing = "Lets go chase us some sheep!";
        }
        return playing;
    }

    public String beHuman(String name, byte age, String breed){
        return "Hello human, i'm " + name + ", a " + age + " year old " + breed + ". What breed are you?";
    }

}
