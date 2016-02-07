//Kobe Miller
//2-6-16
//Arithmatic will calculate cost of each item, tax, ect


public class Arithmatic {
       public static void main(String[] args) {
           
           //Number of pairs of pants
           int numPants = 3;
           //Cost per pair of pants
           double pantsPrice = 34.98;
           //
           //Number of sweatshirts
           int numShirts = 2;
           //Cost per shirt
           double shirtPrice = 24.99;
           //
           //Number of belts
           int numBelts = 1;
           //cost per box of envelopes
           double beltCost = 33.99;
           //
           //the tax rate
           double paSalesTax = 0.06;
           //
           double costPants, costShirts, costBelts, totalCost; //Variables
           //
           //Calculations
           //
           costPants=numPants*pantsPrice;
           costShirts=numShirts*shirtPrice;
           costBelts=numBelts*beltCost;
           totalCost=costBelts+costPants+costShirts;
           //Print out data
           System.out.println("The cost of pants is "+costPants+" dollars");
           System.out.println("The cost of shirts is "+costShirts+" dollars");
           System.out.println("The cost of belts is "+costBelts+" dollars");
           System.out.println("The sales tax of pants is "+(costPants*paSalesTax)+" dollars");
           System.out.println("The sales tax of shirts is "+(costShirts*paSalesTax)+" dollars");
           System.out.println("The sales tax of belts is "+(costBelts*paSalesTax)+" dollars");
           System.out.println("The total cost without tax is "+totalCost+" dollars");
           System.out.println("The total sales tax is "+(totalCost*paSalesTax)+" dollars");
           System.out.println("The total sale including tax is "+((totalCost*paSalesTax)+(totalCost))+" dollars");
           
           
           
           
           
           
    }  //end of main method   
} //end of class