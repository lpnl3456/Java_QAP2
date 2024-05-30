
public class Date {
    //Set veriables

    private int day;
    private int month;
    private int year;

    //Set the day, month, and year
    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //get the Day
    public int getDay() {
        return day;
    }

    //Get the month
    public int getMonth() {
        return month;
    }

    //Get the year
    public int getYear() {
        return year;
    }

    //Set the day
    public void setDay(int day) {
        this.day = day;
    }

    //set the month
    public void setMonth(int month) {
        this.month = month;
    }

    //set the year
    public void setYear(int year) {
        this.year = year;
    }

    //change the entire date
    public void setDate (int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //Display the date
    public String toString() {
       if (this.day < 10 && this.month < 10){
        return ("0" + day + "/" + "0" + this.month + "/" + this.year);
       }

       else if (this.day < 10 ){
        return ("0" + day + "/" +  this.month + "/" + this.year);
       }

       else if ( this.month < 10){
        return (day + "/" + "0" + this.month + "/" + this.year);
       }

       else{
        return (day + "/" + this.month + "/" + this.year);
       }
    }
}
