/* ---------------------------
----Jordan Parks
----October 12, 2015
----a twisty message, hw 7
in this program I will print out a helix looking message based on length of input */

//imports
import java.util.Scanner; //importing this library

//Define class
public class Twisty{
    
    //main method
    public static void main(String[] args) {
    Scanner myScanner = new Scanner( System.in ); //allowing for user input
    System.out.print("Please enter an integer for length: "); //asks for length of helix
    int HelixLength = 0; //set initial number
    while (true) {
       if (myScanner.hasNextInt()) { /*the following loops check to make sure only
       a integer from 1-80 is enter, if it is not valid, user must input it again*/
           HelixLength = myScanner.nextInt();
           if(HelixLength >=1 && HelixLength <= 80){
             break;       
           }
            else{
                 System.out.println("this is not an interger from 1-80 please try again: ");
                 myScanner.nextLine();
            }
        } 
       else{
           System.out.println("this is not an interger from 1-80 please try again: ");
           myScanner.nextLine();
       }
    }
    
    System.out.print("Please enter an integer for width: "); //asks for width of helix
    int HelixWidth = 0; //set initial number
    while (true) {
       if (myScanner.hasNextInt()) { /*the following loops check to make sure only
       a integer from 1-80 is enter, if it is not valid, user must input it again*/
           HelixWidth = myScanner.nextInt();
           if(HelixWidth >=1 && HelixWidth <= 80){
               if(HelixLength > HelixWidth){
                break;
               }
               else{
                 System.out.println("this is not an interger from 1-80 or is greater than the length please try again: ");
                 myScanner.nextLine();
                 }
           }
    } 
       else{
           System.out.println("this is not an interger from 1-80 or is greater than the length please try again: ");
           myScanner.nextLine();
        }
    }
     /* I couldn't figure out the pattern of the helix, this is the closest attempt I got
     that compiled correctly. Everything including the rows and lengths work but the pattern is broken*/
    for(int HelixDown = 0;HelixDown < HelixWidth; HelixDown++){
       for(int j = 0; j < HelixWidth;j++){
        System.out.print("");
        } 
        System.out.println();
        for(int HelixAcross = 0;HelixAcross < HelixLength; HelixAcross++){
            if(HelixAcross < HelixLength){
                System.out.print("#      #");
                System.out.print(" #    #");
                System.out.print("  #  #");
                System.out.print("   ##");
                
            }
            if(HelixAcross < HelixLength){
                System.out.print("\\      /");
                System.out.print(" \\    /");
                System.out.print("  \\  /");
                System.out.print("   \\/");
                break;
            }
        }
    }
    
    System.out.println();
    
    }
}