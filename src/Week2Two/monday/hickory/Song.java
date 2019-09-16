package Week2Two.monday.hickory;

public class Song {
    String word;
    String sent;

    private void song(){
        for (int i = 1 ; i < 9; i++){
            switch (i) {
                case 1:
                    word = "One";
                    sent = "The mouse went down.";
                    break;
                case 2:
                    word = "Two";
                    sent = "The mouse went down.";
                    break;
                case 3:
                    word = "Three";
                    sent = "The jerry free.";
                    break;
                case 4:
                    word = "Four";
                    sent = "He hit the floor.";
                    break;
                case 5:
                    word = "Five";
                    sent = "The mouse could die.";
                    break;
                case 6:
                    word = "Six";
                    sent = "the mouse he split.";
                    break;
                case 7:
                    word = "Seven, Eight, Nine, Ten and Eleven.";
                    sent = " ";
                    break;
                case 8:
                    word = "As twelve bell rang";
                    sent = "The mouse he sprang";
                    break;
            }
            System.out.println("Hickory dickory dock \nThe mouse ran up the clock\n" + "The clock struck "+word + "\n" + sent + "\n");

        }

    }

    public static void main(String[] args) {
        Song song = new Song();
        song.song();


    }
}
