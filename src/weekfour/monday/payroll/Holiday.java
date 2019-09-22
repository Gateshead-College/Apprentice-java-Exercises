package weekfour.monday.payroll;

import java.util.Date;

public class Holiday {

    private Date holidayStartDate;
    private Date holidayEndDate;

    /*Holiday duration should be calculated using the dates provided by the user.
    if the user does not have enough holidays remaining, they should be prompted to start again.
     */

    private int holidayDuration;
    private boolean authorised;

    public Date getHolidayStartDate() {
        return holidayStartDate;
    }

    public void setHolidayStartDate(Date holidayStartDate) {
        this.holidayStartDate = holidayStartDate;
    }

    public Date getHolidayEndDate() {
        return holidayEndDate;
    }

    public void setHolidayEndDate(Date holidayEndDate) {
        this.holidayEndDate = holidayEndDate;
    }

    public int getHolidayDuration() {
        return holidayDuration;
    }

    public void setHolidayDuration(int holidayDuration) {
        this.holidayDuration = holidayDuration;
    }

    public boolean isAuthorised() {
        return authorised;
    }

    public void setAuthorised(boolean authorised) {
        this.authorised = authorised;
    }

    public Holiday(Date holidayStartDate, Date holidayEndDate, int holidayDuration) {
        this.holidayStartDate = holidayStartDate;
        this.holidayEndDate = holidayEndDate;
        this.holidayDuration = holidayDuration;
    }
}
