////////////////////////////////////////
//Jordan Parks
// Sept 7, 2015
//Cyclometer Java Program, lab 02

//Define class
public class Arithmetic {
    
    //main method
    public static void main(String[] args) {
    //My shopping cart stuff
    int nSocks = 3; //Number of pairs of socks
    int nGlasses = 6; //Number of drinking glasses
    int nEnvelopes = 1; //Number of boxes of envelopes
    
    //The cost of the stuff in my shopping cart
    //(‘$’ is part of the variable name)
    double sockCost$ = 2.58; //Cost per pair of socks
    double glassCost$ = 2.29; //Cost per glass
    double envelopeCost$ = 3.25; //cost per box of envelopes
    double taxPercent = 0.06; //the tax

    //My calcuations
    double SockMoney = nSocks*sockCost$;  //this is the cost for socks without tax
    double SockMoneyTax = SockMoney*taxPercent; //this is sock tax
    SockMoneyTax = ((int) (SockMoneyTax*100)); //this is for making only 2 decimals
    SockMoneyTax = (double) SockMoneyTax/100;
    double SockTotalMoney = SockMoney+SockMoneyTax; // grand total cost of socks with tax
    SockTotalMoney = ((int) (SockTotalMoney*100)); //more decimal fixing....
    SockTotalMoney = (double) SockTotalMoney/100;
    double GlassMoney = nGlasses*sockCost$; //cost for glass without tax
    double GlassMoneyTax = GlassMoney*taxPercent; //tax for the glass
    GlassMoneyTax = ((int) (GlassMoneyTax*100)); //this is for making only 2 decimals
    GlassMoneyTax = (double) GlassMoneyTax/100;
    double GlassMoneyTotal = GlassMoney+GlassMoneyTax; //grand total cost of glass with tax
    GlassMoneyTotal = ((int) (GlassMoneyTotal*100)); //even more decimal fixing....
    GlassMoneyTotal = (double) GlassMoneyTotal/100;
    double EnvelopeMoney = nEnvelopes*envelopeCost$; //cost for envelopes without tax
    double EnvelopeMoneyTax = EnvelopeMoney*taxPercent; //envelope tax
    EnvelopeMoneyTax = ((int) (EnvelopeMoneyTax*100)); //this is for making only 2 decimals
    EnvelopeMoneyTax = (double) EnvelopeMoneyTax/100;
    double EnvelopeMoneyTotal =EnvelopeMoney+EnvelopeMoneyTax; /*grand total cost of the
    envelopes with tax*/
    
    //My totals
    double TotalBeforeTax = SockMoney+GlassMoney+EnvelopeMoney; //total cost before tax
    double TotalWithTax = SockTotalMoney+GlassMoneyTotal+EnvelopeMoneyTotal;//total with tax
    
    //print statements
    System.out.println("Socks"); //name
    System.out.println(nSocks + " socks"); //amount
    System.out.println("socks cost $" + sockCost$);//cost
    System.out.println("the socks are $" + SockMoney + " and have tax of $" + SockMoneyTax);//total and taxes
    System.out.println("the total money spent on socks is $" + SockTotalMoney);//grand total
    System.out.println(" "); //just a space
    System.out.println("glasses"); //name
    System.out.println(nGlasses + " glasses"); //amount
    System.out.println("glasses cost $" + glassCost$);//cost
    System.out.println("the glasses are $" + GlassMoney + " and have tax of $" + GlassMoneyTax);//total and taxes
    System.out.println("the total money spent on glasses is $" + GlassMoneyTotal);//grand total
    System.out.println(" "); //just a space
    System.out.println("envelopes"); //name
    System.out.println(nEnvelopes + " envelope");//amount
    System.out.println("envelope cost $" + envelopeCost$);//cost
    System.out.println("the envelope is $" + EnvelopeMoney + " and have tax of $" + EnvelopeMoneyTax);//total and taxes
    System.out.println("the total money spent on the envelope is $" + EnvelopeMoneyTotal);//grand total
    System.out.println(" "); //just a space
    System.out.println("your total cost spent for everything before tax is $" + TotalBeforeTax);//total spent before tax
    System.out.println("your total cost spent for everything with tax is $" + TotalWithTax); //total spent after tax
    }
}