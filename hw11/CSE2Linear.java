/* ---------------------------
----Jordan Parks
----November 9, 2015
----array searching, hw 11
in this program I will use arrays, inputs, and searching */

//imports
import java.util.*; //importing these libraries

//Define class
public class CSE2Linear{
    
    //main method
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in ); //allowing for user input
        
        int[] array1 = new int [16];
        System.out.println("please input 15 integers in ascending order from 0-100"); //prompts user to enter ints 0-100
        array1[0] = -1;
    for(int i=1; i < 15; i++){ // iterates through the array
        while (true) {
            array1[i] = myScanner.nextInt(); //this whole while statement ensures the 15 ints are in ascending order and between 0-100
            int MyBaseNum = array1[i-1];
            int MyBaseNum2 = array1[i];
                if(MyBaseNum2 >= MyBaseNum){
                if(MyBaseNum2 >= 0 && MyBaseNum2 <= 100){
                break;  
                }
                System.out.println("this number is not between 0-100"); //if not 0-100 try again
                myScanner.nextInt();
                }
                    else{
                    System.out.println("this is not greater than the last int entered or not between 0-100, try again: "); //if not greater than try again
                    myScanner.nextInt();
                    }
            
        }
        
    }
    System.out.print("the numbers you choose are: ");
    for(int j=1; j < 15; j++){
        System.out.print(array1[j] + " ");//iterates through and prints the ints the user has choosen
    }
    System.out.println();
    
    System.out.println("Please enter an int to search for: "); //prompts user to find a grade
    int GradeChooser = myScanner.nextInt(); //gets input
    int k = 1;
    for(k=1; k < 15; k++){ //iterates through array and finds if there is a grade, if not next if statement
        if(array1[k] == GradeChooser){
        System.out.println(GradeChooser + " was found in " + k + " iterations");
        break;
        }
    }
    if(k == 15){ //if nothing is found, k will be 15 and prints that nothing was found
    System.out.println("the int " + GradeChooser + " was not found");
    }
    
    int l = 1;
    for (l = 1; l<array1.length; l++) {
	        //find a random number to swap with
	        int rand = (int) (Math.random()*14 + 1);
	        //swaps values
	        int temp = array1[rand];
	        array1[rand] = array1[l];
	        array1[l] = temp;
            }
        
        System.out.println("Scrambled: ");
        for(int m = 1; m < array1.length; m++){
            System.out.print(array1[m]+" ");
        }
        System.out.println();
        
        System.out.println("Please enter an int to search for: "); //prompts user to find a grade
    int GradeChooser2 = myScanner.nextInt(); //gets input
    int n = 1;
    for(n=1; n < 15; n++){ //iterates through array and finds if there is a grade, if not next if statement
        if(array1[n] == GradeChooser2){
        System.out.println(GradeChooser2 + " was found in " + n + " iterations");
        break;
        }
    }
    if(n == 15){ //if nothing is found, k will be 15 and prints that nothing was found
    System.out.println("the int " + GradeChooser2 + " was not found");
    }
}
}