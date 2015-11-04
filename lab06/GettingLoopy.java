/* ---------------------------
----Jordan Parks
----October 2, 2015
----a loopy program, lab 6
in this program I will familiarize myself with loop stuff */

//Define class
public class GettingLoopy{
    
    //main method
    public static void main(String[] args) {
    int x = 1; // variable to loop to get 1-7
    int MoreSevens = 1; //variable for 2nd loop
    int JustASeven = 7; //variable being printed in 2nd loop
    System.out.println("Step 1: ");
    while (x < 8){ //when x is less than 8 this repeats
        System.out.print(x); //prints out x each time
        x++; //increments
    }
    while (MoreSevens < 7){
        System.out.print(JustASeven); //printing a 7
        MoreSevens++; //increments
    }
    System.out.println(); //just a space to make it look clean
// --------------------Part 2 ---------------------------------
    System.out.println("Step 2: ");
    System.out.print("WHILE LOOP: "); //goes before the primes
    int PrimesMin = 10; //the lowest possible num for finding the primes
    int PrimesMax = 100; //highest num for primes, inbetween these 2
    while (PrimesMin < PrimesMax){ /*when the lower is less than 100 I check
    to see if any of the numbers have factors via modulo, the ones that
    don't are the primes! */
        if((PrimesMin % 2 != 0) && (PrimesMin % 3 != 0) && (PrimesMin % 4 != 0) 
        && (PrimesMin % 5 != 0) && (PrimesMin % 7 != 0) ){ 
            System.out.print(PrimesMin + " "); //prints out the primes
        }
        PrimesMin++; //increments
    }
    System.out.println(); //to clean up
// ------------repeat #1 comment for orginization
/*see the original one for comments, only difference here is all the 
variable have a '2' after its name as to not conflict*/
    System.out.print("FOR LOOP: ");
    int PrimesMin2 = 10;
    int PrimesMax2 = 100;
    for (;PrimesMin2 < PrimesMax2;PrimesMin2++){
        if((PrimesMin2 % 2 != 0) && (PrimesMin2 % 3 != 0) && (PrimesMin2 % 4 != 0) 
        && (PrimesMin2 % 5 != 0) && (PrimesMin2 % 7 != 0) ){
            System.out.print(PrimesMin2 + " ");
        }
    }
    System.out.println(); //to clean up
//------------------repeat #2 comment for orginization
/*see the original one for comments, only difference here is all the 
variable have a '3' after its name as to not conflict*/
    System.out.print("DO WHILE LOOP: ");
    int PrimesMin3 = 10;
    int PrimesMax3 = 100;
    do {
        if((PrimesMin3 % 2 != 0) && (PrimesMin3 % 3 != 0) && (PrimesMin3 % 4 != 0) 
        && (PrimesMin3 % 5 != 0) && (PrimesMin3 % 7 != 0) ){
            System.out.print(PrimesMin3 + " ");
        }
        PrimesMin3++;
    }while(PrimesMin3 < PrimesMax3);
    System.out.println(); //to clean up

//------------------PART 3-------------------------------
int RandomSmileys = (int)(Math.random()*201) + 5;
    while (0 < RandomSmileys){
        if (RandomSmileys % 20 == 0){
            System.out.println();
        }
        System.out.print("☺");
        RandomSmileys--;
    }
    System.out.println();
    }
}