package Week3Three.monday.library;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Loan {


    public int bookID;
    public int memberID;
    Date dateTill;

    public Loan(int bookID, int memberID, Date dateTill) {
        this.bookID = bookID;
        this.memberID = memberID;
        this.dateTill = dateTill;
    }
}

