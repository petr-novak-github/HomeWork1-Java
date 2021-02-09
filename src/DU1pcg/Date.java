package DU1pcg;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMount()
    {

        return month;
    }

    public int getYear() {

        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    
    }

    public void setDate(int day, int month, int year) {

        this.day = day;
        this.month = month;
        this.year = year;

    }

    public String toString() {

       // return $"dd/mm/yyyy {day}/{month}/{year}";
        return "dd/mm/yyyy "+ day + "/" + month + "/" + year;
        
    }


}