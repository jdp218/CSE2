/* ---------------------------
----Jordan Parks
----October 9, 2015
----a stary attempt to hide an X, lab 7
in this program I will hide a not so secret X in a star field*/

//imports
import java.util.Scanner; //importing this library

//Define class
public class encrypted_x{
    
    //main method
    public static void main(String[] args) {
    Scanner myScanner = new Scanner( System.in ); //allowing for user input
    System.out.print("Please enter an integer from 0-100 for star field size: "); //asks for square size
    int OMGstar = 0; //set initial number
    while (true) {
       if (myScanner.hasNextInt()) { /*the following loops check to make sure only
       a integer from 1-100 is enter, if it is not valid, user must input it again*/
           OMGstar = myScanner.nextInt();
           if(OMGstar >=0 && OMGstar <= 100){
             break;       
           }
            else{
                 System.out.println("this is not an interger from 0-100 please try again: ");
                 myScanner.nextLine();
            }
        } 
       else{
           System.out.println("this is not an interger from 0-100 please try again: ");
           myScanner.nextLine();
       }
    }

    for(int StarBorder = 0;StarBorder < OMGstar; StarBorder++){
       for(int j = 0; j < OMGstar;j++){
        if(j == StarBorder){
         System.out.print(" ");
                           }
        else if(OMGstar - StarBorder == j+1){
        System.out.print(" "); 
                             }                   
        else{
         System.out.print("*");
            }
        
        } 
        System.out.println();
        
    }
    
    
    }
}