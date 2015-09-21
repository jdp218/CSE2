////////////////////////////////////////
//Jordan Parks
// Sept 13, 2015
//card generator program, lab 4
/* in this program I will print out random cards in a 52 deck */

//Define class
public class CardGenerator{
    
    //main method
    public static void main(String[] args) {
    String SuitType = ""; //string that gets assigned
    int RandomSuit = (int)Math.floor(Math.random()*4) + 1; //random from 1-4
    if (RandomSuit == 1){    //if picks 1 it is diamond
	SuitType = "diamonds";}  //assigning for each of these
	if (RandomSuit == 2){ // if picks 2 it is clubs
	SuitType = "clubs";}
	if (RandomSuit == 3){ //if 3 is hearts
	SuitType = "hearts";}
	if (RandomSuit == 4){ // if 4, spades
	SuitType = "spades";}
	
    int CardNum = (int)Math.floor(Math.random()*12) + 1; //random from 1-12
    String HighCards = ""; //string that gets assigned
    switch (CardNum) { /*switches the random number for each case to case 
    for instance changes the random number 1 to the card 2*/
    case 1:
    HighCards = "2";
    break;
    case 2: 
    HighCards = "3";
    break;
    case 3: 
    HighCards = "4";
    break;
    case 4: 
    HighCards = "5";
    break;
    case 5: 
    HighCards = "6";
    break;
    case 6: 
    HighCards = "7";
    break;
    case 7: 
    HighCards = "8";
    break;
    case 8: 
    HighCards = "9";
    break;
    case 9: 
    HighCards = "10";
    break;
    case 10: 
    HighCards = "Jack";
    break;
    case 11: 
    HighCards = "Queen";
    break;
    case 12: 
    HighCards = "King";
    break;
    case 13: 
    HighCards = "Ace"; 
    break; }
     
    System.out.println("you picked the " + HighCards + " of " + SuitType); //printout of the random suit+card#
    }
}