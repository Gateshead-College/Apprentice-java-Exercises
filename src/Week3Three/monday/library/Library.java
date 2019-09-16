package Week3Three.monday.library;

import java.util.Scanner;

public class Library {
    Scanner sc = new Scanner(System.in);
    Book[] books = new Book[5];
    Member[] members = new Member[5];
    Loan[] loans = new Loan[2];

    private void initialize(){
        books[0] = new Book(1, "The tale of Famine", "Ingram", "1781");
        books[1] = new Book(2, "The tale of War", "Ingram", "1865");
        books[2] = new Book(3, "The tale of Angry", "Ingram", "1896");
        books[3] = new Book(4, "The tale of Misery", "Ingram", "1680");
        books[4] = new Book(5, "The tale of Death", "Ingram", "2001");

        members[0] = new Member(1, "Bob", "Ingram", (byte) 3);
        members[1] = new Member(2, "Ryan", "Ingram", (byte) 5);
        members[2] = new Member(3, "Matty", "Ingram", (byte) 4);
        members[3] = new Member(4, "Donald", "Ingram", (byte) 4);
        members[4] = new Member(5, "Mia", "Ingram", (byte) 4);
        
        loans[0] = new Loan(2,4);
        loans[1] = new Loan(5,2);
        menu();
        
    }

    private void menu() {
        System.out.println("Welcome to the library");
        System.out.println("1. Search for a book");
        System.out.println("2. Check book availability");
        System.out.println("3. Search for books via author");
        byte choice = Byte.parseByte((sc.nextLine()));
        //handleChoice(choice);
    }


}
