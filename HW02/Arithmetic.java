//Kobe Miller
//2-6-16
//HW02
//Arithmatic will calculate cost of each item, tax, ect


public class Arithmetic {
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
           double costPants, costShirts, costBelts, totalCost, 
           taxPants, taxShirts, taxBelts, taxSales, totalSale; //Variables set
           //
           //Calculations
           //
           costPants=numPants*pantsPrice; //total costs of pants
           //
           costShirts=numShirts*shirtPrice; //total costs of shirts
           //
           costBelts=numBelts*beltCost; //total costs of belts
           //
           totalCost=costBelts+costPants+costShirts; //total cost of everything
           //
           taxPants=costPants*paSalesTax; //tax on pants
           //
           taxShirts=costShirts*paSalesTax; //tax on shirts
           //
           taxBelts=costBelts*paSalesTax; //tax on belts
           //
           taxSales=totalCost*paSalesTax; //tax on everything
           //
           totalSale=((totalCost*paSalesTax)+totalCost); //total cost with tax
           //
           //Print out data
           //
           //Cost of pants
           System.out.println("The cost of pants is "+
                costPants+" dollars");
           //
           //Cost of shirts
           System.out.println("The cost of shirts is "+
                costShirts+" dollars");
           //
           //Costs of Belts
           System.out.println("The cost of belts is "+
                costBelts+" dollars");
           //
           //Sales tax of pants
           System.out.println("The sales tax of pants is "+
                (taxPants)+" dollars");
           //
           //Sales taax of shirts
           System.out.println("The sales tax of shirts is "+
                (taxShirts)+" dollars");
           //
           //Sales tax of belts
           System.out.println("The sales tax of belts is "+
                (taxBelts)+" dollars");
           //
           //Total cost of everything without tax
           System.out.println("The total cost without tax is "+
                totalCost+" dollars");
           //
           //Total sales tax
           System.out.println("The total sales tax is "+
                (taxSales)+" dollars");
           //
           //Total cost of everything
           System.out.println("The total sale including tax is "+
                (totalSale)+" dollars");
           
    }  //end of main method   
} //end of class