////////////////////////////////////////
//Jordan Parks
// Sept 11, 2015
//Check Java Program, lab 03
/* in this program I will take the user input to gather info on the check's amount,
how many people are paying, and the tip% they wish to pay */
//imports
import java.util.Scanner; //importing this library

//Define class
public class Check {
    
    //main method
    public static void main(String[] args) {
    Scanner myScanner = new Scanner( System.in ); //allowing for user input
    
    //the user input parts
    System.out.print("Enter the original cost of the check in the form xx.xx: "); //ask for user input of the check
    double checkCost = myScanner.nextDouble(); //accepting the user input of the check cost
    System.out.print("Enter the % tip that you wish to pay as a whole number (in the form xx): "); //asks for user input of tip
    double tipPercent = myScanner.nextDouble(); //accepting the user input of the tip percent
    tipPercent = tipPercent/100; //convert the percentage into a decimal value
    System.out.print("Enter the number of people who went out to dinner: "); //asks for user input of num of peeps
    int numPeople = myScanner.nextInt(); ////accepting user input of num of peeps
    
    //calculations and printing
    double totalCost = checkCost * (1 + tipPercent); //gets the check and tip amount and combines to check&tip grand total
    double costPerPerson = totalCost / numPeople; // takes grand total and divides by num of peeps
    int dollars = (int)costPerPerson; //dollars peeps will owe
    int dimes = (int)(costPerPerson * 10) % 10; // first decimal of the cents peeps will owe
    int pennies = (int)(costPerPerson * 100) % 10; //2nd decimal of the ents peeps will owe
    System.out.println("Each person in the group owes $ " + dollars + "." + dimes + pennies); //the final printout
    }
}