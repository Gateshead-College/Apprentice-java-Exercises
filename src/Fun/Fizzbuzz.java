package Fun;

public class Fizzbuzz {
    public static void main(String[] args) {

        for (int i = 1; i < 20; i++) {
            String word = "";

            if (i % 3 == 0) {
                word= (word+"Fizz");
            }
            if (i % 5 == 0) {
                word= (word+"Buzz");
            }
            if (word.equals("")){
                word = (String.valueOf(i));
            }
            System.out.println(word);

        }
    }
}
