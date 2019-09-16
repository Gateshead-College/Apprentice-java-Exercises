package Week1One;

class Dog {
    private String name;
    private String size;
    private String breed;
    private int age;

    Dog(String name, String size, String breed, int age) {
        this.name = name;
        this.size = size;
        this.breed = breed;
        this.age = age;
    }

    String bark(String size) {
        String bark;
        if ((size.equalsIgnoreCase("small"))) {
            bark = "Yap Yap Yap";
        } else if ((size.equalsIgnoreCase("medium"))) {
            bark = "woof woof";
        } else {
            bark = "WOOF WOOF";
        }

        return bark;
    }

    String play(String size) {
        String playing;
        if ((breed.equalsIgnoreCase("Poodle"))) {
            playing = "Fancy_Response";
        } else if ((breed.equalsIgnoreCase("Labrador"))) {
            playing = "Energetic_Response";
        } else if ((breed.equalsIgnoreCase("Border Collie"))) {
            playing = "Sheep_Response";
        } else {
            playing = "Not_A_Dog_Response";
        }


        return playing;
    }

    String status(int age) {
        String status;
        if (age < (1)) {
            status = "a puppy!!";
        } else if ((age >= (2)) && (age < (4))){
            status = "middle aged";
        } else if ((age >= (5)) && (age < (8))) {
            status = "olddddddddddd";
        } else {
            status = "Dead.... Your Dog Is Dead";
        }


        return status;
    }

   



}
