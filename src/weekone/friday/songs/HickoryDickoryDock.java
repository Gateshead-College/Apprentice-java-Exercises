package weekone.friday.songs;

public class HickoryDickoryDock {

    public static void main(String[] args) {
        HickoryDickoryDock hdd = new HickoryDickoryDock();
        hdd.sing();
    }

    private void sing() {
        for (byte counter = 1; counter < 13; counter++) {
            System.out.println("Hickory Dickory Dock,");
            String[] nextLines = getLines(counter);
            System.out.println(nextLines[0]);
            if(counter != 12) {
                System.out.println("The clock struck " + counter);
            }
            else {
                System.out.println("The clock struck noon");
            }
            System.out.println(nextLines[1]);
            System.out.println("Hickory Dickory Dock.");
            System.out.println();
        }
    }

    private String[] getLines(byte counter){

        String[] lines = new String[2];

        switch(counter){

            case 1:
                lines[0] = "The mouse ran up the clock,";
                lines[1] = "The mouse ran down,";
                break;

            case 2:
                lines[0] = "The bird looked at the clock,";
                lines[1] = "Away she flew,";
                break;

            case 3:
                lines[0] = "The dog barked at the clock,";
                lines[1] = "Fiddle-de-dee,";
                break;

            case 4:
                lines[0] = "The bear slept by the clock,";
                lines[1] = "He ran out of the door,";
                break;

            case 5:
                lines[0] = "The bee buzzed around the clock,";
                lines[1] = "She went to her hive,";
                break;

            case 6:
                lines[0] = "The hen pecked at the clock,";
                lines[1] = "Oh fiddle sticks,";
                break;

            case 7:
                lines[0] = "The cat ran around the clock,";
                lines[1] = "She wanted to get'em,";
                break;

            case 8:
                lines[0] = "The horse jumped over the clock,";
                lines[1] = "He ate some cake,";
                break;

            case 9:
                lines[0] = "The cow danced on the clock,";
                lines[1] = "She felt so fine,";
                break;

            case 10:
                lines[0] = "The pig oinked at the clock,";
                lines[1] = "She did it again,";
                break;

            case 11:
                lines[0] = "The duck quacked at the clock,";
                lines[1] = "The duck said oh heavens,";
                break;
            case 12:
                lines[0] = "The mouse ran up the clock,";
                lines[1] = "He's here to soon,";
                break;
        }
        return lines;
    }
}
