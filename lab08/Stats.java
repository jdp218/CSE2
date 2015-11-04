/* ---------------------------
----Jordan Parks
----October 16, 2015
----finding averages from inputs with methods, lab 8
in this program I will familiarize myself with methods*/

//imports
import java.util.Scanner; //importing this library

//Define class
public class Stats{

//my mean method
public static double myMean(double A, double B, double C,
double D, double E){  //naming 5 variables to stand in for the 5 choosen doubles
    double Mean = (A+B+C+D+E)/5; //calcing the mean
    return Mean; //returning the mean
}

public static double myMedian(double A, double B, double C,
double D, double E){ //again naming 5 variables to stand in for the 5 choosen doubles
    double Median = C; //finding the median
    return Median; //reutrning the median
}



    
    //main method
    public static void main(String[] args) {
    Scanner myScanner = new Scanner( System.in ); //allowing for user input
    System.out.print("Please enter the first double: "); //asks for double1
    double MyDoubleOne = 0; //set initial number
    while (true) {
       if (myScanner.hasNextDouble()) { /*the following loops check to make sure only
       a double is enter, if it is not valid, user must input it again*/
           MyDoubleOne = myScanner.nextDouble();
            break;                      
                                   }
            else{
                 System.out.println("this is not a double try again: ");
                 myScanner.nextLine();
                }
        } 
//-------------------------------------2nd Double-------------------------------     
    
    System.out.print("Please enter a higher 2nd double: "); //asks for double2
    double MyDoubleTwo = 0; //set initial number
    while (true) {
       if (myScanner.hasNextDouble()) { /*the following loops check to make sure only
       a double is enter, if it is not valid, user must input it again*/
           MyDoubleTwo = myScanner.nextDouble();
                                      }
           if(MyDoubleTwo > MyDoubleOne){
               break;
           }
               
               else{
                 System.out.println("This is not a double or is not greater than the first double: ");
                 myScanner.nextLine();
                 }
           }
//-------------------------------------3rd Double-------------------------------         
    System.out.print("Please enter a higher 3rd double: "); //asks for double3
    double MyDoubleThree = 0; //set initial number
    while (true) {
       if (myScanner.hasNextDouble()) { /*the following loops check to make sure only
       a double is enter, if it is not valid, user must input it again*/
           MyDoubleThree = myScanner.nextDouble();
                                      }
           if(MyDoubleThree > MyDoubleTwo){
               break;
           }
               
               else{
                 System.out.println("This is not a double or is not greater than the second double: ");
                 myScanner.nextLine();
                 }
           }
//-------------------------------------4th Double-------------------------------     
    System.out.print("Please enter a higher 4th double: "); //asks for double4
    double MyDoubleFour = 0; //set initial number
    while (true) {
       if (myScanner.hasNextDouble()) { /*the following loops check to make sure only
       a double is enter, if it is not valid, user must input it again*/
           MyDoubleFour = myScanner.nextDouble();
                                      }
           if(MyDoubleFour > MyDoubleThree){
               break;
           }
               
               else{
                 System.out.println("This is not a double or is not greater than the third double: ");
                 myScanner.nextLine();
                 }
           }
//-------------------------------------5th Double-------------------------------     
    System.out.print("Please enter a higher 5th double: "); //asks for double5
    double MyDoubleFive = 0; //set initial number
    while (true) {
       if (myScanner.hasNextDouble()) { /*the following loops check to make sure only
       a double is enter, if it is not valid, user must input it again*/
           MyDoubleFive = myScanner.nextDouble();
                                      }
           if(MyDoubleFive > MyDoubleFour){ 
               break;
           }
               
               else{
                 System.out.println("This is not a double or is not greater than the fourth double: ");
                 myScanner.nextLine();
                 }
           }
           
double calculatedMean = myMean(MyDoubleOne,MyDoubleTwo,MyDoubleThree,MyDoubleFour,MyDoubleFive);
    System.out.println("the mean is: " + calculatedMean);
        
double calculatedMedian = myMedian(MyDoubleOne,MyDoubleTwo,MyDoubleThree,MyDoubleFour,MyDoubleFive);
    System.out.println("the median is: " + calculatedMedian);
    }
}