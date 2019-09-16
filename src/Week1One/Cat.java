package Week1One;

class Cat {
    private String name;
    private String size;
    private String breed;
    private int age;

    Cat(String name, String size, String breed, int age) {
        this.name = name;
        this.size = size;
        this.breed = breed;
        this.age = age;
    }

    String meow(String size) {
        String meow;
        if ((size.equalsIgnoreCase("small"))) {
            meow = "Purrr Purrrr Purrrr";
        } else if ((size.equalsIgnoreCase("medium"))) {
            meow = "Meow Meow";
        } else {
            meow = "HEFFA MEOW";
        }

        return meow;
    }

    String play(String size) {
        String playing;
        if ((breed.equalsIgnoreCase("Sphynx"))) {
            playing = "Weird_Cat_No_Hair";
        } else if ((breed.equalsIgnoreCase("Siamese"))) {
            playing = "Expensive_Response";
        } else if ((breed.equalsIgnoreCase("House"))) {
            playing = "Normal_Response";
        } else {
            playing = "Not_A_Cat_Response";
        }

        return playing;
    }

    String status(int age) {
        String status;
        if (age < (1)) {
            status = "a kitten!!";
        } else if ((age >= (2)) && (age < (4))){
            status = "middle aged";
        } else if ((age >= (5)) && (age < (8))) {
            status = "olddddddddddd";
        } else {
            status = "Dead.... Your Cat Is Dead";
        }


        return status;
    }
}
