/* ---------------------------
----Jordan Parks
----October 20, 2015
----finding areas of shapes, lab 8
in this program I will take user input to calculate the area of a rectangle, triangle, or circle*/

//imports
import java.util.Scanner; //importing this library

//Define class
public class Area{

//my rectangle method
public static double RectArea(double width, double length){
    double RectangleArea = width*length; //gets the area of the rectangle
    return RectangleArea; //returning the area of the rectangle
}

//my triangle method
public static double TriArea(double base, double height){
    double TriangleArea = (base*height)/2; //gets the area of the triangle
    return TriangleArea; //returns the area of the triangle
}

//my circle method
public static double CircArea(double radius){
    double CircleArea = (3.14)*(radius*radius); //gets the area of the circle
    return CircleArea; //returns the area of the circle
}

    //main method
    public static void main(String[] args) {
    Scanner myScanner = new Scanner( System.in ); //allowing for user input
    System.out.print("Please enter 'rectangle', 'triangle', or 'circle' exactly" + 
    "like that for which you wish to calc the area for : "); //asks for tri,rect, or circle
    String myString;
    while(true){ //what this whole loops does is make sure that only rectangle triangle or circle ends up in myString
        myString = myScanner.nextLine(); 
        if(myString.equals("rectangle") || myString.equals("triangle") || myString.equals("circle")){
            break;
        }
        else{
            System.out.println("you did not enter 'rectangle' 'triangle' or 'circle'" );
            
            }
    }
    
    
//for rectangle-------------------------------------
    while(myString.equals("rectangle")){ //if the user enters rectangle this loop will ask for the rect specs
        System.out.println("please enter the rectangle width");
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
                    
        System.out.println("please enter the rectangle length");
        double MyDoubleTwo = 0; //set initial number
        while (true) {
        if (myScanner.hasNextDouble()) { /*the following loops check to make sure only
         a double is enter, if it is not valid, user must input it again*/
           MyDoubleTwo = myScanner.nextDouble();
            break;                      
                                       }
            else{
                 System.out.println("this is not a double try again: ");
                 myScanner.nextLine();
                }
                    }
double calculatedRectangle = RectArea(MyDoubleOne,MyDoubleTwo); //pulls the code from the rectangle method
    System.out.println("the area of the rectangle is: " + calculatedRectangle);
    break;
                                    }

//for triangle-----------------------
    while(myString.equals("triangle")){ //if the user enters triangle this loop will ask for the tri specs
        System.out.println("please enter the triangle base");
        double MyDoubleThree = 0; //set initial number
        while (true) {
        if (myScanner.hasNextDouble()) { /*the following loops check to make sure only
         a double is enter, if it is not valid, user must input it again*/
           MyDoubleThree = myScanner.nextDouble();
            break;                      
                                       }
            else{
                 System.out.println("this is not a double try again: ");
                 myScanner.nextLine();
                }
                    }
                    
        System.out.println("please enter the rectangle height");
        double MyDoubleFour = 0; //set initial number
        while (true) {
        if (myScanner.hasNextDouble()) { /*the following loops check to make sure only
         a double is enter, if it is not valid, user must input it again*/
           MyDoubleFour = myScanner.nextDouble();
            break;                      
                                       }
            else{
                 System.out.println("this is not a double try again: ");
                 myScanner.nextLine();
                }
                    }
double calculatedTriangle = TriArea(MyDoubleThree,MyDoubleFour); //pulls the code from the triangle method
    System.out.println("the area of the triangle is: " + calculatedTriangle);
    break;
                                    }

//for circle-----------------------------------------
        while(myString.equals("circle")){ //if the user enters circle this loop will ask for the circle specs
        System.out.println("please enter the circle radius");
        double MyDoubleFive = 0; //set initial number
        while (true) {
        if (myScanner.hasNextDouble()) { /*the following loops check to make sure only
         a double is enter, if it is not valid, user must input it again*/
           MyDoubleFive = myScanner.nextDouble();
            break;                      
                                       }
            else{
                 System.out.println("this is not a double try again: ");
                 myScanner.nextLine();
                }
                    }
double calculatedCircle = CircArea(MyDoubleFive); //pulls the code from the circle method
    System.out.println("the area of the circle is: " + calculatedCircle);
    break;
                                    }


    }
}