////////////////////////////////////////
//Jordan Parks
// Sept 9, 2015
//Cyclometer Java Program, lab 02

//Define class
public class Cyclometer {
    
    //main method
    public static void main(String[] args) {
    //these are the times that were randomly recorded
    double secsTrip1=480;  //seconds in trip1
    double secsTrip2=3220;  //seconds in trip2
    //Converting the seconds into minutes as per asked
    double Trip1InMinutes = secsTrip1/60;
    double Trip2InMinutes = secsTrip2/60;
    //these were the times the wheels turned
    double WheelTurns1=1561;  //times wheel turned in trip1
	double WheelTurns2=9037; //times wheel turned in trip2
	//converting times a wheel turned into distance:
	double wheelDiameter=27.0;  // the size of the wheel
  	double PI=3.14159; // well its PI
  	double inchesPerFoot=12;
  	double feetPerMile=5280;  // convert from feet to miles
  	//the calculation getting the distance in inches and converting to miles
  	double DistanceTrip1 = WheelTurns1*wheelDiameter*PI/inchesPerFoot/feetPerMile;
  	double DistanceTrip2 = WheelTurns2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
  	double TotalDistance = DistanceTrip1 + DistanceTrip2;
  	//now finally to print my solution
  	System.out.println("Trip one took " + Trip1InMinutes + " minutes and had " + 
  	WheelTurns1 + " wheel turns");
  	System.out.println("Trip two took " + Trip2InMinutes + " minutes and had " +
  	WheelTurns2 + " wheel turns");
  	System.out.println("trip 1 was " + DistanceTrip1 + " miles");
  	System.out.println("trip 2 was " + DistanceTrip2 + " miles");
  	System.out.println("the total distance of the trip was " + TotalDistance + " miles");
    } //end of method
} //end of class