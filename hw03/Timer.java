////////////////////////////////////////
//Jordan Parks
// Sept 13, 2015
//Timer Java Program, homework 03
/* in this program I will take the user input to 
calculate time until dinner */

//imports
import java.util.Scanner; //importing this library

//Define class
public class Timer{
    
    //main method
    public static void main(String[] args) {
    Scanner myScanner = new Scanner( System.in ); //allowing for user input
    
    //the user input parts
    System.out.print("Enter the current time in the form HHMM: "); //ask for user input of time
    double CurrentTime = myScanner.nextDouble(); //accepting the user input of current time
    CurrentTime = CurrentTime/100; //converting the time into a workable xx.xx format
    System.out.print("Enter when dinner is in the form HHMM: "); //asks user when dinner is
    double DinnerTime = myScanner.nextDouble(); //accepting it is dinner time
    DinnerTime = DinnerTime/100; //converting the time into a workable xx.xx format
    double TimeRemaining = DinnerTime - CurrentTime; //getting the total time remaining

    //Calcs and Prints
    int Hours = (int) TimeRemaining; //dollars peeps will owe
    int TenMinutes = (int) (TimeRemaining * 10) % 10; // the ten minute slot of time value
    int Minutes = (int) (TimeRemaining * 100) % 10; // the minute slot of time value
    
    System.out.println("you have " + Hours +  " hours and " + TenMinutes + 
    Minutes + " minutes until dinner time" ); //the final printout
   
    }
}