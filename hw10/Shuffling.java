/* ---------------------------
----Jordan Parks
----November 2, 2015
----more poker!, hw 10
in this program I will use arrays, methods, and random gen to
get shuffled decks of cards as well as random 5 card hands */

/*I changed the main method a bit because the way it was setup did not make alot of 
sense to me, so I moved the code that fills String[] cards into the individual methods
and deleted the array String[] hand because it was completely unneccesary*/

//imports
import java.util.*; //importing these libraries

//Define class
public class Shuffling{
  
    //Print method ---------------------------------
    public static void printArray(String[] cards, String[] rankNames, String[] suitNames){
        for (int i=0; i<52; i++){
            cards[i]=rankNames[i%13]+suitNames[i/13];
            System.out.print(cards[i]+" ");
            } 
        
    }
  
    //Shuffle method -------------------------------
    public static void shuffle(String[] cards, String[] rankNames, String[] suitNames){
        for (int i=0; i<cards.length; i++){
        cards[i]=rankNames[i%13]+suitNames[i/13];
        }
        for (int j=0; j<cards.length; j++) {
	        //find a random number to swap with
	        int rand = (int) (Math.random()*cards.length);
	        //swaps values
	        String temp = cards[rand];
	        cards[rand] = cards[j];
	        cards[j] = temp;
            }
        for(int k = 0; k < cards.length; k++){
            System.out.print(cards[k]+" ");
        }
    }
  
    public static void randomizeHand(String[] cards, String[] rankNames, String[] suitNames){
        for (int i=0; i<cards.length; i++){
        cards[i]=rankNames[i%13]+suitNames[i/13];
        }
        for (int j=0; j<cards.length; j++) {
	        //find a random number to swap with
	        int rand = (int) (Math.random()*cards.length);
	        //swaps values
	        String temp = cards[rand];
	        cards[rand] = cards[j];
	        cards[j] = temp;
            }
        for(int k = 0; k < 5; k++){
            System.out.print(cards[k]+" ");
        }
    }
  
  
    //Main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
	    //suits club, heart, spade or diamond
        String[] suitNames={"C","H","S","D"};   
        String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
        String[] cards = new String[52];

    printArray(cards, rankNames, suitNames);
    System.out.println();
    System.out.println("Shuffled");
    shuffle(cards, rankNames, suitNames);
    System.out.println();
    System.out.println("Randomized hand!");
    randomizeHand(cards, rankNames, suitNames);
    System.out.println();
        
    }
}