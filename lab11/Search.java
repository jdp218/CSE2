/* ---------------------------
----Jordan Parks
----November 6, 2015
----array searching, lab 11
in this program I will use arrays, inputs, and random gen to make test scores */

//imports
import java.util.*; //importing these libraries

//Define class
public class Search{
    
    //main method
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in ); //allowing for user input
    //--------------fill array1------------
    int[] array1 = new int [5000];
    for(int i=0; i < 5000; i++){ // iterates through the array
        array1[i] = (int) (Math.random()*100000); //random num from 0-100000;
        }
    //----------------finding the min------------     
    int min = 1000000;       
    for(int j=0; j < 5000; j++){
        if(array1[j] < min)
        min = array1[j];
    }
    System.out.println("the min of array1 is: " + min);
    //-----------------finding the max-----------
    int max = 0;
    for(int k=0; k < 5000; k++){
        if(array1[k] > max){
            max = array1[k];
        }
    }
    System.out.println("the max of array1 is: " + max);
    //-----------fill array2---------------
    int JustARandomNum;
    int[] array2 = new int [5002];
    array2[0] = 0;
    array2[1] = (int) ((Math.random()*19)+1);
    for(int l=1; l < 5002; l++){ // iterates through the array
        JustARandomNum = (int) ((Math.random()*19)+1); //makes a random num from 1-20
        array2[l] = array2[l-1] + JustARandomNum;
    }
    
    //----- print array2 min and max
    System.out.println("the array2 minimum is: " + array2[1]);
    System.out.println("the array2 maximum is: " + array2[5001]);
    
    //----- user input part ---------
    System.out.println("please enter an int >= 0");
    int myInt;
    while (true) {
            if(myScanner.hasNextInt()){
            myInt = myScanner.nextInt();
                if(myInt >= 0){
                 break;
                }
                if(myInt < 0){
                    return;
                }
            
            }
            else{
                String trash = myScanner.nextLine();
                System.out.println("ERROR no strings plox");
            }
    }
    int myCounter = 1;    // count the num of comparisons
    int lowerbound = 1; // int stand-in for my lower bound of array2
    int upperbound = 5002; //int stand-in for my upper bound of arary2
    int k = (int) array2.length/2;

     while((array2[k] != myInt) && (lowerbound <= upperbound))
     {
     myCounter++;
         if (array2[k] > myInt){                                              
            upperbound = k - 1;   
         }                                                             
         else{                                                        
            lowerbound = k + 1; 
         }
         k = (lowerbound + upperbound) / 2;
    }
    if (lowerbound <= upperbound){
    System.out.println("The binary search found the number " + myInt + " after " + myCounter + " iterations.");
    }
        else{
        System.out.println("the number you choose is not in this array. Binarily searched "
            + myCounter + " times.");
        }

    }
}