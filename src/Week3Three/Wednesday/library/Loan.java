package Week3Three.Wednesday.library;

import java.util.Date;

public class Loan {


    public int bookID;
    public int memberID;

    public Loan(int bookID, int memberID, Date dateTill) {
        this.bookID = bookID;
        this.memberID = memberID;
    }
}

