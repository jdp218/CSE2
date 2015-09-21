////////////////////////////////////////
//Jordan Parks
// Sept 20, 2015
//card generator program, hw 04
/* in this program I will print out 5 random cards and 
check for matching cards */
// this would be alot easier and shorter if I could use a for loop...

/*I took lab4 code and copied it an addition 4 times, modifying suittype
and CardNum to SuitTypeOne(two)(three) etc*/

/*300 lines later, I added a checking system I made that can check
for high card, one pair, two pair, and three of a kind*/

//Define class
public class PokerHandCheck{
    
    //main method
    public static void main(String[] args) {
    
    String SuitTypeOne = ""; //string that gets assigned
    int RandomSuitOne = (int)Math.floor(Math.random()*4) + 1; //random from 1-4
    if (RandomSuitOne == 1){    //if picks 1 it is diamond
	SuitTypeOne = "diamonds";}  //assigning for each of these
	if (RandomSuitOne == 2){ // if picks 2 it is clubs
	SuitTypeOne = "clubs";}
	if (RandomSuitOne == 3){ //if 3 is hearts
	SuitTypeOne = "hearts";}
	if (RandomSuitOne == 4){ // if 4, spades
	SuitTypeOne = "spades";}
	
    int CardNumOne = (int)Math.floor(Math.random()*12) + 1; //random from 1-12
    String HighCardsOne = ""; //string that gets assigned
    switch (CardNumOne) { /*switches the random number for each case to case 
    for instance changes the random number 1 to the card 2*/
    case 1:
    HighCardsOne = "2";
    break;
    case 2: 
    HighCardsOne = "3";
    break;
    case 3: 
    HighCardsOne = "4";
    break;
    case 4: 
    HighCardsOne = "5";
    break;
    case 5: 
    HighCardsOne = "6";
    break;
    case 6: 
    HighCardsOne = "7";
    break;
    case 7: 
    HighCardsOne = "8";
    break;
    case 8: 
    HighCardsOne = "9";
    break;
    case 9: 
    HighCardsOne = "10";
    break;
    case 10: 
    HighCardsOne = "Jack";
    break;
    case 11: 
    HighCardsOne = "Queen";
    break;
    case 12: 
    HighCardsOne = "King";
    break;
    case 13: 
    HighCardsOne = "Ace"; 
    break; }
    
    System.out.println("you picked the " + HighCardsOne + " of " + SuitTypeOne); //printout of the random suit+card#
    
// PICK TWO, comment for orginization --------------------------------------------

String SuitTypeTwo = ""; //string that gets assigned
    int RandomSuitTwo = (int)Math.floor(Math.random()*4) + 1; //random from 1-4
    if (RandomSuitTwo == 1){    //if picks 1 it is diamond
	SuitTypeTwo = "diamonds";}  //assigning for each of these
	if (RandomSuitTwo == 2){ // if picks 2 it is clubs
	SuitTypeTwo = "clubs";}
	if (RandomSuitTwo == 3){ //if 3 is hearts
	SuitTypeTwo = "hearts";}
	if (RandomSuitTwo == 4){ // if 4, spades
	SuitTypeTwo = "spades";}
	
    int CardNumTwo = (int)Math.floor(Math.random()*12) + 1; //random from 1-12
    String HighCardsTwo = ""; //string that gets assigned
    switch (CardNumTwo) { /*switches the random number for each case to case 
    for instance changes the random number 1 to the card 2*/
    case 1:
    HighCardsTwo = "2";
    break;
    case 2: 
    HighCardsTwo = "3";
    break;
    case 3: 
    HighCardsTwo = "4";
    break;
    case 4: 
    HighCardsTwo = "5";
    break;
    case 5: 
    HighCardsTwo = "6";
    break;
    case 6: 
    HighCardsTwo = "7";
    break;
    case 7: 
    HighCardsTwo = "8";
    break;
    case 8: 
    HighCardsTwo = "9";
    break;
    case 9: 
    HighCardsTwo = "10";
    break;
    case 10: 
    HighCardsTwo = "Jack";
    break;
    case 11: 
    HighCardsTwo = "Queen";
    break;
    case 12: 
    HighCardsTwo = "King";
    break;
    case 13: 
    HighCardsTwo = "Ace"; 
    break; }
    
    System.out.println("you picked the " + HighCardsTwo + " of " + SuitTypeTwo); //printout of the random suit+card#
    
//PICK THREE, comment for orginization ----------------------------------------------

String SuitTypeThree = ""; //string that gets assigned
    int RandomSuitThree = (int)Math.floor(Math.random()*4) + 1; //random from 1-4
    if (RandomSuitThree == 1){    //if picks 1 it is diamond
	SuitTypeThree = "diamonds";}  //assigning for each of these
	if (RandomSuitThree == 2){ // if picks 2 it is clubs
	SuitTypeThree = "clubs";}
	if (RandomSuitThree == 3){ //if 3 is hearts
	SuitTypeThree = "hearts";}
	if (RandomSuitThree == 4){ // if 4, spades
	SuitTypeThree = "spades";}
	
    int CardNumThree = (int)Math.floor(Math.random()*12) + 1; //random from 1-12
    String HighCardsThree = ""; //string that gets assigned
    switch (CardNumThree) { /*switches the random number for each case to case 
    for instance changes the random number 1 to the card 2*/
    case 1:
    HighCardsThree = "2";
    break;
    case 2: 
    HighCardsThree = "3";
    break;
    case 3: 
    HighCardsThree = "4";
    break;
    case 4: 
    HighCardsThree = "5";
    break;
    case 5: 
    HighCardsThree = "6";
    break;
    case 6: 
    HighCardsThree = "7";
    break;
    case 7: 
    HighCardsThree = "8";
    break;
    case 8: 
    HighCardsThree = "9";
    break;
    case 9: 
    HighCardsThree = "10";
    break;
    case 10: 
    HighCardsThree = "Jack";
    break;
    case 11: 
    HighCardsThree = "Queen";
    break;
    case 12: 
    HighCardsThree = "King";
    break;
    case 13: 
    HighCardsThree = "Ace"; 
    break; }
    
    System.out.println("you picked the " + HighCardsThree + " of " + SuitTypeThree); //printout of the random suit+card#
    
//PICK FOUR, comment for orginization ----------------------------------------

String SuitTypeFour = ""; //string that gets assigned
    int RandomSuitFour = (int)Math.floor(Math.random()*4) + 1; //random from 1-4
    if (RandomSuitFour == 1){    //if picks 1 it is diamond
	SuitTypeFour = "diamonds";}  //assigning for each of these
	if (RandomSuitFour == 2){ // if picks 2 it is clubs
	SuitTypeFour = "clubs";}
	if (RandomSuitFour == 3){ //if 3 is hearts
	SuitTypeFour = "hearts";}
	if (RandomSuitFour == 4){ // if 4, spades
	SuitTypeFour = "spades";}
	
    int CardNumFour = (int)Math.floor(Math.random()*12) + 1; //random from 1-12
    String HighCardsFour = ""; //string that gets assigned
    switch (CardNumFour) { /*switches the random number for each case to case 
    for instance changes the random number 1 to the card 2*/
    case 1:
    HighCardsFour = "2";
    break;
    case 2: 
    HighCardsFour = "3";
    break;
    case 3: 
    HighCardsFour = "4";
    break;
    case 4: 
    HighCardsFour = "5";
    break;
    case 5: 
    HighCardsFour = "6";
    break;
    case 6: 
    HighCardsFour = "7";
    break;
    case 7: 
    HighCardsFour = "8";
    break;
    case 8: 
    HighCardsFour = "9";
    break;
    case 9: 
    HighCardsFour = "10";
    break;
    case 10: 
    HighCardsFour = "Jack";
    break;
    case 11: 
    HighCardsFour = "Queen";
    break;
    case 12: 
    HighCardsFour = "King";
    break;
    case 13: 
    HighCardsFour = "Ace"; 
    break; }
    
    System.out.println("you picked the " + HighCardsFour + " of " + SuitTypeFour); //printout of the random suit+card#
    
//PICK FIVE, comment for orginization -----------------------------------

String SuitTypeFive = ""; //string that gets assigned
    int RandomSuitFive = (int)Math.floor(Math.random()*4) + 1; //random from 1-4
    if (RandomSuitFive == 1){    //if picks 1 it is diamond
	SuitTypeFive = "diamonds";}  //assigning for each of these
	if (RandomSuitFive == 2){ // if picks 2 it is clubs
	SuitTypeFive = "clubs";}
	if (RandomSuitFive == 3){ //if 3 is hearts
	SuitTypeFive = "hearts";}
	if (RandomSuitFive == 4){ // if 4, spades
	SuitTypeFive = "spades";}
	
    int CardNumFive = (int)Math.floor(Math.random()*12) + 1; //random from 1-12
    String HighCardsFive = ""; //string that gets assigned
    switch (CardNumFive) { /*switches the random number for each case to case 
    for instance changes the random number 1 to the card 2*/
    case 1:
    HighCardsFive = "2";
    break;
    case 2: 
    HighCardsFive = "3";
    break;
    case 3: 
    HighCardsFive = "4";
    break;
    case 4: 
    HighCardsFive = "5";
    break;
    case 5: 
    HighCardsFive = "6";
    break;
    case 6: 
    HighCardsFive = "7";
    break;
    case 7: 
    HighCardsFive = "8";
    break;
    case 8: 
    HighCardsFive = "9";
    break;
    case 9: 
    HighCardsFive = "10";
    break;
    case 10: 
    HighCardsFive = "Jack";
    break;
    case 11: 
    HighCardsFive = "Queen";
    break;
    case 12: 
    HighCardsFive = "King";
    break;
    case 13: 
    HighCardsFive = "Ace"; 
    break; }
     
    System.out.println("you picked the " + HighCardsFive + " of " + SuitTypeFive); //printout of the random suit+card#
    
// MY POKER HAND CHECKING -----------------------------------------

//essentially here I want to check any and all combos of matching cards

/*first I use a lot of booleans to check if any sort of combination of my
cards are equal*/
int CountPairs = 0; //this is my pair counter
boolean IsEqual = HighCardsOne == HighCardsTwo;
boolean IsEqualTwo = HighCardsOne == HighCardsThree;
boolean IsEqualThree = HighCardsOne == HighCardsFour;
boolean IsEqualFour = HighCardsOne == HighCardsFive;
boolean IsEqualFive = HighCardsTwo == HighCardsThree;
boolean IsEqualSix = HighCardsTwo == HighCardsFour;
boolean IsEqualSeven = HighCardsTwo == HighCardsFive;
boolean IsEqualEight = HighCardsThree == HighCardsFour;
boolean IsEqualNine = HighCardsThree == HighCardsFive;
boolean IsEqualTen = HighCardsFour == HighCardsFive;

/*now here I check the booleans for matching pairs, if there is a match,
then CountPairs will add 1 to itself, obviously since there are only 5
cards this can only happen up to 2 times*/
if (IsEqual == true) {
    CountPairs = CountPairs + 1;
}
if (IsEqualTwo == true) {
    CountPairs = CountPairs + 1;
}
if (IsEqualThree == true) {
    CountPairs = CountPairs + 1;
}
if (IsEqualFour == true) {
    CountPairs = CountPairs + 1;
}
if (IsEqualFive == true) {
    CountPairs = CountPairs + 1;
}
if (IsEqualSix == true) {
    CountPairs = CountPairs + 1;
}
if (IsEqualSeven == true) {
    CountPairs = CountPairs + 1;
}
if (IsEqualEight == true) {
    CountPairs = CountPairs + 1;
}
if (IsEqualNine == true) {
    CountPairs = CountPairs + 1;
}
if (IsEqualTen == true) {
    CountPairs = CountPairs + 1;
}
/*if 0 pairs, I have a high card, if 1, one pair, if 2, two pair*/
if (CountPairs == 0){
    System.out.println("You have a high card!"); }
if (CountPairs == 1){
    System.out.println("You have a pair!"); }
if (CountPairs == 2){
    System.out.println("You have two pair!"); } 

/* For the rare case you get three of a kind!!!!! -----------------------------
 For some reason you can't say == two times so I did some math
 in a way that only the times I want it to display will happen
 this will fail only if 16 cause 4*4 and 2*8 is only non
'multiply itself' factor within the 1-12 range */
/*to fix this I multiplied both sides by a rediculous number, like 257 and
added by the other number*/
if (CardNumOne+(CardNumTwo*257) == CardNumThree+(CardNumThree*257)) {
    System.out.println("OMG you have three of a kind!");
}
if (CardNumOne+(CardNumTwo*257) == CardNumFour+(CardNumFour*257)) {
    System.out.println("OMG you have three of a kind!");
}
if (CardNumOne+(CardNumTwo*257) == CardNumFive+(CardNumFive*257)) {
    System.out.println("OMG you have three of a kind!");
}
if (CardNumOne+(CardNumThree*257) == CardNumFour+(CardNumFour*257)) {
    System.out.println("OMG you have three of a kind!");
}
if (CardNumOne+(CardNumThree*257) == CardNumFive+(CardNumFive*257)) {
    System.out.println("OMG you have three of a kind!");
}
if (CardNumOne+(CardNumFour*257) == CardNumFive+(CardNumFive*257)) {
    System.out.println("OMG you have three of a kind!");
}
if (CardNumTwo+(CardNumThree*257) == CardNumFour+(CardNumFour*257)) {
    System.out.println("OMG you have three of a kind!");
}
if (CardNumTwo+(CardNumThree*257) == CardNumFive+(CardNumFive*257)) {
    System.out.println("OMG you have three of a kind!");
}
if (CardNumTwo+(CardNumFour*257) == CardNumFive+(CardNumFive*257)) {
    System.out.println("OMG you have three of a kind!");
}
if (CardNumThree+(CardNumFour*257) == CardNumFive+(CardNumFive*257)) {
    System.out.println("OMG you have three of a kind!");
}

    }
}