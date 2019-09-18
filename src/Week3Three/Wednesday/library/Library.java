package Week3Three.Wednesday.library;


import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    Scanner sc = new Scanner(System.in);
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Member> members = new ArrayList<>();
    ArrayList<Loan> loans = new ArrayList<>();

    public static void main(String[] args) {
        Library lib = new Library();
        lib.start();
    }

    private void start() {
    }


}
