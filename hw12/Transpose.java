/* ---------------------------
----Jordan Parks
----November 16, 2015
----array transposing, hw 12
in this program I will use make matrixes (i can't spell?), print, and transpose them */

//imports
import java.util.*; //importing these libraries

//Define class
public class Transpose{
    
    //my random matrix method
    public static int[][] randomMatrix(int height, int width){
    //first num is the columns, aka height, 2nd is width aka rows for row method
    int[][]myMatrix = new int[height][width];
    for(int fillHeight = 0; fillHeight < height; fillHeight++ ){
        for(int fillWidth = 0; fillWidth < width; fillWidth++){
            myMatrix[fillHeight][fillWidth] = (int) ((Math.random()*21) - 10);; //filling the multi-dem array with random nums of -10 to 10
            
        }
    }
    return myMatrix;
}
    
    //my printing matrix method
    public static void printMatrix(int myMatrix[][], int height, int width){
        if( height == 0 || width == 0){
            System.out.print("this is not a rectangle"); //check if rectangle... something is wrong with this part of assignment
            //the inputs will always be a rectangle since no raggid arrays will be made
        }
        for(int a = 0; a < myMatrix.length; a++){
            for(int b = 0; b < myMatrix[a].length; b++){ 
                System.out.print(myMatrix[a][b] + "\t"); //prints the array by looping though each dimension via 2x for loop
            }
            System.out.println(); //for the sake of clarity
        }
    }
    
    //my transpose method
    public static int[][] transposeMatrix(int[][]ThisMatrix, int height, int width){
        int[][]myMatrix = new int[width][height];
    for(int fillWidth = 0; fillWidth < width; fillWidth++ ){
        for(int fillHeight = 0; fillHeight < height; fillHeight++){
            myMatrix[fillWidth][fillHeight] = ThisMatrix[fillHeight][fillWidth]; //filling the multi-dem array with random nums of -10 to 10
            
        }
    
    }
    return myMatrix;
}
    
    //main method
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in ); //allowing for user input
        System.out.println("please enter an int > 0 for the width");
    int width;
    while (true) {
            if(myScanner.hasNextInt()){
            width = myScanner.nextInt();
                if(width > 0){
                 break;
                }
                if(width < 0){
                    System.out.println("please enter a positive integer"); //no neg numbs
                }
            
            }
            else{
                String trash = myScanner.nextLine(); //trashes strings and other useless input
                System.out.println("ERROR try again");
            }
    }
     System.out.println("please enter an int > 0 for the height");  
       int height;
    while (true) {
            if(myScanner.hasNextInt()){
            height = myScanner.nextInt();
                if(height > 0){
                 break;
                }
                if(height < 0){
                    System.out.println("please enter a positive integer"); //no neg numbs
                }
            
            }
            else{
                String trash = myScanner.nextLine(); //trashes strings and other useless input
                System.out.println("ERROR try again");
            }
    } 
        
        int[][]ThisMatrix = randomMatrix(height,width); //performs randomMatrix method and saves it in this
        printMatrix(ThisMatrix, height, width); //prints what was saved
        System.out.println(); //for the sake of clarity
        int[][]ThisMatrix2 = transposeMatrix(ThisMatrix, height, width); //performs transpose method and saves it in this
        printMatrix(ThisMatrix2, height, width); //prints what was saved
    }
}