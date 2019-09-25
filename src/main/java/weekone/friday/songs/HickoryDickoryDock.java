package weekone.friday.songs;

public class HickoryDickoryDock {

    public static void main(String[] args) {
        HickoryDickoryDock hdd = new HickoryDickoryDock();
        hdd.sing();
    }

    private void sing() {
        for (byte counter = 1; counter < 13; counter++) {
            System.out.println("Hickory Dickory Dock,");
            writeLines(counter);
            System.out.println("Hickory Dickory Dock.");
            System.out.println();
        }
    }

    private void writeLines(byte counter){

        switch(counter){

            case 1:
                System.out.println("The mouse ran up the clock,");
                System.out.println("The clock struck " + counter);
                System.out.println("The mouse ran down,");
                break;

            case 2:
                System.out.println("The bird looked at the clock,");
                System.out.println("The clock struck " + counter);
                System.out.println("Away she flew,");
                break;

            case 3:
                System.out.println("The dog barked at the clock,");
                System.out.println("The clock struck " + counter);
                System.out.println("Fiddle-de-dee,");
                break;

            case 4:
                System.out.println("The bear slept by the clock,");
                System.out.println("The clock struck " + counter);
                System.out.println("He ran out of the door,");
                break;

            case 5:
                System.out.println("The bee buzzed around the clock,");
                System.out.println("The clock struck " + counter);
                System.out.println("She went to her hive,");
                break;

            case 6:
                System.out.println("The hen pecked at the clock,");
                System.out.println("The clock struck " + counter);
                System.out.println("Oh fiddle sticks,");
                break;

            case 7:
                System.out.println("The cat ran around the clock,");
                System.out.println("The clock struck " + counter);
                System.out.println("She wanted to get'em,");
                break;

            case 8:
                System.out.println("The horse jumped over the clock,");
                System.out.println("The clock struck " + counter);
                System.out.println("He ate some cake,");
                break;

            case 9:
                System.out.println("The cow danced on the clock,");
                System.out.println("The clock struck " + counter);
                System.out.println("She felt so fine,");
                break;

            case 10:
                System.out.println("The pig oinked at the clock,");
                System.out.println("The clock struck " + counter);
                System.out.println("She did it again,");
                break;

            case 11:
                System.out.println("The duck quacked at the clock,");
                System.out.println("The clock struck " + counter);
                System.out.println("The duck said oh heavens,");
                break;
            case 12:
                System.out.println("The mouse ran up the clock,");
                System.out.println("The clock struck noon");
                System.out.println("He's here to soon,");
                break;
        }
    }
}
