package weekfour.monday.payroll.models;

import java.util.Date;

public class Holiday {

    private String holidayStartDate;
    private String holidayEndDate;

    /*Holiday duration should be calculated using the dates provided by the user.
    if the user does not have enough holidays remaining, they should be prompted to start again.
     */

    private int holidayDuration;
    private boolean authorised;

    public String getHolidayStartDate() {
        return holidayStartDate;
    }

    public void setHolidayStartDate(String holidayStartDate) {
        this.holidayStartDate = holidayStartDate;
    }

    public String getHolidayEndDate() {
        return holidayEndDate;
    }

    public void setHolidayEndDate(String holidayEndDate) {
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

    public Holiday(String holidayStartDate, String holidayEndDate, int holidayDuration) {
        this.holidayStartDate = holidayStartDate;
        this.holidayEndDate = holidayEndDate;
        this.holidayDuration = holidayDuration;
    }
}
