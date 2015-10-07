/* ---------------------------
----Jordan Parks
----October 6, 2015
----Digit Checker, hw 06
in this program I will check if a barcode is valid */

//imports
import java.util.Scanner; //importing this library

//Define class
public class CheckDigit{
    
    //main method
    public static void main(String[] args) {
    Scanner myScanner = new Scanner( System.in ); //allowing for user input
    System.out.print("Please enter a 10 digit barcode: "); //asks for the barcode expenses
    int BarCodeCheck = 0; //set initial double
    while (true) {
       if (myScanner.hasNextInt()) { /*the following loops check to make sure only
       a valid barcode is enter, if it is not valid, user must input it again*/
           BarCodeCheck = myScanner.nextInt();
           int a = BarCodeCheck/100000;
           a = a/10000;
           if(a >=1 && a <= 9){
         break;       
           }
           else{
           System.out.println("This is not a valid ISBN. Please enter 10 digits: ");
           myScanner.nextLine();
       }} else{
           System.out.println("This is not a valid ISBN. Please enter 10 digits: ");
           myScanner.nextLine();
       }
    }
    BarCodeCheck = BarCodeCheck/100000;
    BarCodeCheck = BarCodeCheck/100000;
    int DigitOne = ((int)(BarCodeCheck * 10) % 10)*10; // grabs the 1st number that was entered and multi by 10
    int DigitTwo = ((int)(BarCodeCheck * 100) % 10)*9; // grabs the 2nd number that was entered and multi by 9
    int DigitThree = ((int)(BarCodeCheck * 1000) % 10)*8; // grabs the 3rd number that was entered and multi by 8
    int DigitFour = ((int)(BarCodeCheck * 10000) % 10)*7; // grabs the 4th number that was entered and multi by 7
    int DigitFive = ((int)(BarCodeCheck * 100000) % 10)*6; // grabs the 5th number that was entered and multi by 6
    int DigitSix = ((int)(BarCodeCheck * 1000000) % 10)*5; // grabs the 6th number that was entered and multi by 5
    int DigitSeven = ((int)(BarCodeCheck * 10000000) % 10)*4; // grabs the 7th number that was entered and multi by 4
    int DigitEight = ((int)(BarCodeCheck * 100000000) % 10)*3; // grabs the 8th number that was entered and multi by 3
    int DigitNine = ((int)(BarCodeCheck * 1000000000) % 10)*2; // grabs the 9th number that was entered and multi by 2
    int DigitTen = (int)(BarCodeCheck * 100000000 * 100) % 10; // the 10th digit
    
    int DigitSum = DigitOne + DigitTwo + DigitThree + DigitFour + 
        DigitFive + DigitSix + DigitSeven + DigitEight + DigitNine;
    int DigitRemainder = DigitSum % 11;
    
    if(DigitRemainder == DigitTen){
        System.out.println("This is a valid ISBN.");
    }
    else{
    System.out.println("This is NOT a valid ISBN. Check digit should be " + DigitRemainder );
    }
    
        
    
    
    }
}