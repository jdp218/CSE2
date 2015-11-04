/* ---------------------------
----Jordan Parks
----October 30, 2015  its halloween tommorow!
----arrays are a thing, lab 10
in this program I will use arrays, inputs, and random gen to make test scores */

//imports
import java.util.*; //importing these libraries

//Define class
public class Arrays{
    
    //main method
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in ); //allowing for user input
        int myRandomNumber = (int) (Math.random()*5)+5; //random num from 5-10
    //--------------names------------
        String[] students = new String [myRandomNumber];
        int i = 0;
        for(i=0; i < myRandomNumber; i++){ // iterates through the array
            System.out.println("please enter another name: ");
            students[i] = myScanner.next(); //grabs the next user input
            
        }
    //--------------scores------------    
        int[] midterm = new int [myRandomNumber];
        int j = 0;
        for(j=0; j < myRandomNumber; j++){ // iterates through the array
            midterm[j] = (int) (Math.random()*100); //random num from 0-100
            
        }
    //--------------print statements----------
        int k = 0;
        for(k=0; k < myRandomNumber; k++){
            System.out.println(students[k] + ": " + midterm[k]);
        }

    }
}
    
    