

public class Time {
    //Set the veriables
    private int hour;
    private int minute;
    private int second;

    //Set the hour, minute,second
    public Time(int hour, int minute, int second){
        this. hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //Get the hour
    public int getHour() {
        return hour;
    }

    //Get the minute
    public int getMinute() {
        return minute;
    }

    //Get the second
    public int getSecond() {
        return second;
    }

    //Set the hour
    public void setHour(int hour) {
        this.hour = hour;
    }

    //Set the minute
    public void setMinute(int minute) {
        this.minute = minute;
    }

    //Set the second
    public void setSecond(int second) {
        this.second = second;
    }

    //Change the time
    public void setTime(int hour, int minute, int second){
        this. hour = hour;
        this.minute = minute;
        this.second = second;

    }

    //Display the time in a string
    public String toString(){

        String disHour = String.valueOf(this.hour);
        String disMinute = String.valueOf(this.minute);
        String disSecond = String.valueOf(this.second);

         if (this.hour < 10 ){
            disHour = "0" + disHour;
           }
    
        if ( this.minute < 10){
                disMinute = "0" + disMinute;
           }
    
        if (this.second < 10){
            disSecond = "0" + disSecond;
           }

           return (disHour + ":" + disMinute + ":" + disSecond);
    }

    //Adavance the time by one second
    public Time nextSecond(){

    
       this.second++;

        if (this.second >58){
            this.second = 0;
            this.minute++;
            if (this.minute >58){
                this.minute = 0;
                this.hour++;

                if (this.hour >23){
                    this.hour = 0;
                }
            }
        }

        return this;
    }

    //Have the time go back by one second
    public Time prevoiusSecond(){

        
        this.second --;
 
         if (this.second == -1){
            this.second = 59;
            this.minute--;
             if (this.minute == -1){
                this.minute = 59;
                this.hour--;
 
                 if (this.hour == -1 ){
                    this.hour = 23;
                 }
             }
         }
 
         return this;
     }
}
