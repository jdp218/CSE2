/* ---------------------------
----Jordan Parks
----October 5, 2015
----hey look its a bar (star!) graph, hw 06
in this program I will check to make sure user inputs valid money amounts and print a star graph */

//imports
import java.util.Scanner; //importing this library

//Define class
public class BarGraph{
    
    //main method
    public static void main(String[] args) {
    Scanner myScanner = new Scanner( System.in ); //allowing for user input

int RoundedMondayMoney = 0;
int RoundedTuesdayMoney = 0;
int RoundedWednesdayMoney = 0;
int RoundedThursdayMoney = 0;
int RoundedFridayMoney = 0;
int RoundedSaturdayMoney = 0;
int RoundedSundayMoney = 0;

    
//--------------------------------- MONDAY ------------------------------------  

   System.out.print("Enter monday's expenses in the form xx.xx: "); //asks for monday's expenses
   double MondayMoney = 0; //set initial double
   while (true) {
       if (myScanner.hasNextDouble()) { /*the following loops check to make sure only integers can
       be inputted, if its not a number, you repeat until a number is put in*/
           MondayMoney = myScanner.nextDouble();
           break;
       } else{
           System.out.println("error you didn't input an integer");
           myScanner.nextLine();
       }
   }
    if (MondayMoney >= 0){
        RoundedMondayMoney = (int)(MondayMoney + 0.5); //rounds up or down for star graph
    }
   
//--------------------------------- TUESDAY ------------------------------------      

    System.out.print("Enter tuesday's expenses in the form xx.xx: "); //asks for tuesday's expenses
    double TuesdayMoney = 0;//set initial double
    while (true) {
       if (myScanner.hasNextDouble()) { /*the following loops check to make sure only integers can
       be inputted, if its not a number, you repeat until a number is put in*/
           TuesdayMoney = myScanner.nextDouble();
           break;
       } else{
           System.out.println("error you didn't input an integer");
           myScanner.nextLine();
       }
   }
    if (TuesdayMoney >= 0){
        RoundedTuesdayMoney = (int)(TuesdayMoney + 0.5); //rounds up or down for star graph
    }
    
//--------------------------------- WEDNESDAY ------------------------------------     

    System.out.print("Enter wednesday's expenses in the form xx.xx: "); //asks for wednesday's expenses
    double WednesdayMoney = 0;//set initial double
    while (true) {
       if (myScanner.hasNextDouble()) {/*the following loops check to make sure only integers can
       be inputted, if its not a number, you repeat until a number is put in*/
           WednesdayMoney = myScanner.nextDouble();
           break;
       } else{
           System.out.println("error you didn't input an integer");
           myScanner.nextLine();
       }
   }
    if (WednesdayMoney >= 0){
        RoundedWednesdayMoney = (int)(WednesdayMoney + 0.5);//rounds up or down for star graph
    }
    
//--------------------------------- THURSDAY ------------------------------------
    System.out.print("Enter thursday's expenses in the form xx.xx: "); //asks for thursday's expenses
    double ThursdayMoney = 0;//set initial double
    while (true) {
       if (myScanner.hasNextDouble()) {/*the following loops check to make sure only integers can
       be inputted, if its not a number, you repeat until a number is put in*/
           ThursdayMoney = myScanner.nextDouble();
           break;
       } else{
           System.out.println("error you didn't input an integer");
           myScanner.nextLine();
       }
   }
    if (ThursdayMoney >= 0){
        RoundedThursdayMoney = (int)(ThursdayMoney + 0.5);//rounds up or down for star graph
    }
    
//--------------------------------- FRIDAY ------------------------------------
    System.out.print("Enter friday's expenses in the form xx.xx: "); //asks for friday's expenses
    double FridayMoney = 0;//set initial double
    while (true) {
       if (myScanner.hasNextDouble()) {/*the following loops check to make sure only integers can
       be inputted, if its not a number, you repeat until a number is put in*/
           FridayMoney = myScanner.nextDouble();
           break;
       } else{
           System.out.println("error you didn't input an integer");
           myScanner.nextLine();
       }
   }
    if (FridayMoney >= 0){
        RoundedFridayMoney = (int)(FridayMoney + 0.5);//rounds up or down for star graph
    }

//--------------------------------- SATURDAY ------------------------------------    
    System.out.print("Enter saturday's expenses in the form xx.xx: "); //asks for saturday's expenses
    double SaturdayMoney = 0;//set initial double
    while (true) {
       if (myScanner.hasNextDouble()) {/*the following loops check to make sure only integers can
       be inputted, if its not a number, you repeat until a number is put in*/
           SaturdayMoney = myScanner.nextDouble();
           break;
       } else{
           System.out.println("error you didn't input an integer");
           myScanner.nextLine();
       }
   }
    if (SaturdayMoney >= 0){
        RoundedSaturdayMoney = (int)(SaturdayMoney + 0.5);//rounds up or down for star graph
    }

//--------------------------------- SUNDAY ------------------------------------
    System.out.print("Enter sunday's expenses in the form xx.xx: "); //asks for sunday's expenses
    double SundayMoney = 0;//set initial double
    while (true) {
       if (myScanner.hasNextDouble()) {/*the following loops check to make sure only integers can
       be inputted, if its not a number, you repeat until a number is put in*/
           SundayMoney = myScanner.nextDouble();
           break;
       } else{
           System.out.println("error you didn't input an integer");
           myScanner.nextLine();
       }
   }
    if (SundayMoney >= 0){
        RoundedSundayMoney = (int)(SundayMoney + 0.5);//rounds up or down for star graph
    }

//----Calculations, outputs, and graph thingy
if (MondayMoney >= 0){
    System.out.printf("Expenses for monday: " + "$" + "%.2f %n", MondayMoney); //prints the expense
}else{
    System.out.printf("Sorry you did not enter an integer. Try again: " + "%.2f %n", MondayMoney); //prints the error
}

//---------------------------------

if (TuesdayMoney >= 0){
    System.out.printf("Expenses for tuesday: " + "$" + "%.2f %n", TuesdayMoney); //prints the expense
}else{
    System.out.printf("Sorry you did not enter an integer. Try again: " + "%.2f %n", TuesdayMoney);//prints the error
}

//---------------------------------

if (WednesdayMoney >= 0){
    System.out.printf("Expenses for wednesday: " + "$" + "%.2f %n", WednesdayMoney); //prints the expense
}else{
    System.out.printf("Sorry you did not enter an integer. Try again: " + "%.2f %n", WednesdayMoney);//prints the error
}

//---------------------------------

if (ThursdayMoney >= 0){
    System.out.printf("Expenses for thursday: " + "$" + "%.2f %n", ThursdayMoney); //prints the expense
}else{
    System.out.printf("Sorry you did not enter an integer. Try again: " + "%.2f %n", ThursdayMoney);//prints the error
}

//---------------------------------

if (FridayMoney >= 0){
    System.out.printf("Expenses for friday: " + "$" + "%.2f %n", FridayMoney); //prints the expense
}else{
    System.out.printf("Sorry you did not enter an integer. Try again: " + "%.2f %n", FridayMoney);//prints the error
}

//---------------------------------

if (SaturdayMoney >= 0){
    System.out.printf("Expenses for saturday: " + "$" + "%.2f %n", SaturdayMoney); //prints the expense
}else{
    System.out.printf("Sorry you did not enter an integer. Try again: " + "%.2f %n", SaturdayMoney);//prints the error
}

//---------------------------------

if (SundayMoney >= 0){
    System.out.printf("Expenses for sunday: " + "$" + "%.2f %n", SundayMoney);//prints the expense
}else{
    System.out.printf("Sorry you did not enter an integer. Try again: " + "%.2f %n", SundayMoney);//prints the error
}

// *************** star graph ***************
System.out.print("Monday:    ");
while (0 < RoundedMondayMoney){ //takes the inputed numbers and counts down to 0 as it prints out *s
        System.out.print("*");  
        RoundedMondayMoney--;
    }
    System.out.println();
System.out.print("Tuesday:   ");
while (0 < RoundedTuesdayMoney){//takes the inputed numbers and counts down to 0 as it prints out *s
        System.out.print("*");
        RoundedTuesdayMoney--;
    }
    System.out.println();
System.out.print("Wednesday: ");
while (0 < RoundedWednesdayMoney){//takes the inputed numbers and counts down to 0 as it prints out *s
        System.out.print("*");
        RoundedWednesdayMoney--;
    }
    System.out.println();
System.out.print("Thursday:  ");
while (0 < RoundedThursdayMoney){//takes the inputed numbers and counts down to 0 as it prints out *s
        System.out.print("*");
        RoundedThursdayMoney--;
    }
    System.out.println();
System.out.print("Friday:    ");
while (0 < RoundedFridayMoney){//takes the inputed numbers and counts down to 0 as it prints out *s
        System.out.print("*");
        RoundedFridayMoney--;
    }
    System.out.println();
System.out.print("Saturday:  ");
while (0 < RoundedSaturdayMoney){//takes the inputed numbers and counts down to 0 as it prints out *s
        System.out.print("*");
        RoundedSaturdayMoney--;
    }
    System.out.println();
System.out.print("Sunday:    ");
while (0 < RoundedSundayMoney){//takes the inputed numbers and counts down to 0 as it prints out *s
        System.out.print("*");
        RoundedSundayMoney--;
    }
    System.out.println();



// ************* calculations *************
double average = (MondayMoney + TuesdayMoney + WednesdayMoney + ThursdayMoney + FridayMoney 
+ SaturdayMoney + SundayMoney)/7;
System.out.printf("Your average weekly expenses are: " + "$" + "%.2f %n", average);
double FourYearExpense = average;
for(int x=0;x < 208;x++){
    double RandomSpending = average*((((int)(Math.random()*41)-20)/100)+1);
    /*here I take a random num from 0-40
    and then substract 20, div by 100, then add one. This makes it so I will get a number from
    .8 to 1.2*/
    double NewExpense = average+RandomSpending;
    FourYearExpense = FourYearExpense - average + NewExpense;
}
System.out.printf("Estimated expenditure for 4 years: " + "$" + "%.2f %n", FourYearExpense);
    }
}
    