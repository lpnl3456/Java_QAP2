public class TestTime {
    public static void main(String [] args){
        
        //Create a Time object set to 21:10:15
        Time t1 = new Time(0,0,0);
        t1.setHour(21);
        t1.setMinute(10);
        t1.setSecond(15);

        //Create a Time object set to 10:20:25
        Time t2 = new Time(0,0,0);
        t2.setHour(10);
        t2.setMinute(20);
        t2.setSecond(25);

        //Addvance t1 by one second
        t1.nextSecond();

        //Have t2 go back by one second
        t2.prevoiusSecond();

        //Display the new times
        System.out.println(t1.toString());
        System.out.println(t2.toString());
    }
}
