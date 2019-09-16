package Week3Three.monday.library;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Library {
    Scanner sc = new Scanner(System.in);
    Book[] books = new Book[5];
    Member[] members = new Member[5];
    Loan[] loans = new Loan[2];
    SimpleDateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) throws ParseException {
        Library lb = new Library();
        lb.initialize();
    }

    private void initialize() throws ParseException {

        books[0] = new Book(1, "The tale of Famine", "Ingram", "1781");
        books[1] = new Book(2, "The tale of War", "Bingram", "1865");
        books[2] = new Book(3, "The tale of Angry", "Lingram", "1896");
        books[3] = new Book(4, "The tale of Misery", "Tingram", "1680");
        books[4] = new Book(5, "The tale of Death", "Ingram", "2001");

        members[0] = new Member(1, "Bob", "Ingram", (byte) 3);
        members[1] = new Member(2, "Ryan", "Ingram", (byte) 5);
        members[2] = new Member(3, "Matty", "Ingram", (byte) 4);
        members[3] = new Member(4, "Donald", "Ingram", (byte) 4);
        members[4] = new Member(5, "Mia", "Ingram", (byte) 4);

        loans[0] = new Loan(2, 4, df1.parse("22/09/2019"));
        loans[1] = new Loan(5, 2, df1.parse("20/09/2019"));
        menu();

    }

    private void menu() {
        System.out.println("Welcome to the library");
        System.out.println("1. Search for a book");
        System.out.println("2. Check book availability");
        System.out.println("3. Search for books via author");
        byte choice = Byte.parseByte((sc.nextLine()));
        handleChoice(choice);
    }

    private void handleChoice(byte choice) {
        switch (choice) {
            case 1:
                searchBook();
                break;
            case 2:
                checkBook();
                break;
            case 3:
                searchAuthor();
                break;
            default:
                System.out.println("Please enter a valid number");
                menu();
        }

    }

    private void checkBook() {
        System.out.println("Which book do you wish to check? ");
        String book = sc.nextLine();

        for (int i = 0; i < books.length; i++) {
            if (books[i].bookTitle.equalsIgnoreCase(book)) {
                for (int k = 0; i < loans.length; k++) {
                    if (loans[k].bookID == books[i].bookID) {

                        System.out.println("This book is on loan until: " + df1.format(loans[k].dateTill)+"\nThat is a "+new SimpleDateFormat("EEEE").format(loans[k].dateTill));
                        System.out.println("Do you wish to reserve it? Y/N");
                        String res = sc.nextLine();
                        if (res.equalsIgnoreCase("y")) {
                            System.out.println("What is your forename");
                            String resname = sc.nextLine();
                            for(int r = 0; r < members.length; r++){
                                if(members[r].memberForename.equalsIgnoreCase(resname)){
                                    System.out.println("Okay your reservation is below");
                                    System.out.println(books[i].bookTitle.toString()+" is reserved for "+ members[r].memberForename + " "+ members[r].memberSurname+ "on "+ df1.format(loans[k].dateTill)+"\nThat is a "+new SimpleDateFormat("EEEE").format(loans[k].dateTill) );
                                    menu();
                                }
                                else{
                                    System.out.println("That name is not a member!");
                                }
                            }
                        }

                        else{
                                System.out.println("Okay no reserve needed");
                                menu();
                            }

                    } else {
                        System.out.println("That book is available");
                    }
                }
            }
            else if (i == books.length - 1) {
                System.out.println("Sorry we dont have that book");
                menu();

            }
        }
    }


    private void searchAuthor() {
        System.out.println("Which author? ");
        String author = sc.nextLine();
        boolean done = false;
        for (int i = 0; i < books.length; i++) {
            if (books[i].bookAuthor.equalsIgnoreCase(author)) {
                if (!done) {
                    System.out.println("We have that book");
                }
                System.out.println(books[i].bookTitle.toString());
                done = true;
            } else if (i == books.length - 1) {
                if (!done) {
                    System.out.println("Sorry we dont have that book");
                    menu();
                } else {
                    menu();
                }
            }
        }
    }

    private void searchBook() {
        System.out.println("Which book? ");
        String title = sc.nextLine();

        for (int i = 0; i < books.length; i++) {
            if (books[i].bookTitle.equalsIgnoreCase(title)) {
                System.out.println("We have that book in the library");
                System.out.println("Please go to the menu to check if its available");
                menu();
            } else if (i == books.length - 1) {
                System.out.println("Sorry we dont have that book");
                menu();
            }
        }
    }


}
