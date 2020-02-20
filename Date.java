/**
 * Date
 */
public class Date {
    
    // Instance Variables
     int day;
     int month;
     int year;
     String event;

    // Default Constructor (No Parameters)
    public Date(){
        day = 1;
        month = 1;
        year = 1;
        event = "Nothing on today";
    }

    // Parameterized constructor (1 Parameter)
    public Date(int day){
        this.day = day;
    }

     // Parameterized constructor (2 Parameters)
    public Date(int day, int month){
        this(day);
        this.month = month;
    }
    

    // Parameterized constructor (3 Parameters)
    public Date(int day, int month, int year){
        this(day, month);
        this.year = year;
    }


    // Parameterized constructor (3 Parameters)
    public Date(int day, int month, int year, String event){
        this(day, month, year);
        this.event = event;
    }
    

    

    

    // A simple print method
    public void printDate(){
        // Print the date like this: day/month/year
        // Your code here
        System.out.println(day +"/"+ month+"/"+year+" "+event);
    }

}
