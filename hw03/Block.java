////////////////////////////////////////
//Jordan Parks
// Sept 13, 2015
//Block Java Program, homework 03
/* in this program I will take the user input to 
calculate the volume and surface area of a block */

//imports
import java.util.Scanner; //importing this library

//Define class
public class Block{
    
    //main method
    public static void main(String[] args) {
    Scanner myScanner = new Scanner( System.in ); //allowing for user input
    
    //the user input parts
    System.out.print("Enter the length of the block: "); //ask for user input of block length
    double BlockLength = myScanner.nextDouble(); //accepting the user input of the length
    System.out.print("Enter the width of the block: "); //asks for user input of block width
    double BlockWidth = myScanner.nextDouble(); //accepting the user input of the width
    System.out.print("Enter the height of the block: "); //ask for user input of block height
    double BlockHeight = myScanner.nextDouble(); //accepting the user input of the height
    
    //Calcs and Prints
    double BlockVolume = BlockHeight*BlockWidth*BlockLength; //calculating the volume
    double BlockSurfaceArea = (2*BlockLength*BlockWidth) + (2*BlockWidth*BlockHeight) +
    (2*BlockLength*BlockHeight); //calculating the surface area
    System.out.println("The volume of the block of dimensions " + BlockLength
    + " x " + BlockWidth + " x " + BlockHeight + " is " + BlockVolume); //printout of volume
    System.out.println("The surface area of the block is " 
    + BlockSurfaceArea); //printout of surface area
   
    }
}