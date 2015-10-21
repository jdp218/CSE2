/* ---------------------------
----Jordan Parks
----October 20, 2015
----breaking up strings, lab 8
in this program I will take user input and see what is inside the components of a string*/

//imports
import java.util.Scanner; //importing this library

//Define class
public class StringAnalysis{

//my character checking method
    public static void CharCheck(String myString, int myInt){
    int counter = 0;
    while(myInt > 0){
        char myChar = myString.charAt(myInt);
        if(myChar >= 'a' && myChar <= 'z')
                            {
          counter = counter + 1;
                            }
        myInt--;
                 }
    
    System.out.println("you have " + counter + " letters");
    }


    //main method
    public static void main(String[] args) {
    Scanner myScanner = new Scanner( System.in ); //allowing for user input
    System.out.println("please enter a string");
    String myString = myScanner.nextLine();
    System.out.println("how many characters do you wish to examine? please input a number or type 'all'");
    if(myScanner.hasNextInt()){
        int myCounter = myScanner.nextInt();
        CharCheck(myString, myCounter);
    }
    else{
      String myCounterTwo = myScanner.nextLine();  
      while(true){
          if(myCounterTwo.equals("all")){
        int myCounterThree = myString.length();
        CharCheck(myString, myCounterThree);
        break;                              
            }
            else{
    System.out.println("you did not enter a number or 'all' please try again");
    myCounterTwo = myScanner.nextLine();
                }  
                                        }
                }
    
    
    }
}