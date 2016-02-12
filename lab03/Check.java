//Kobe Miller
//2-12-16
//lab03
//This is a basic calculator
//It will find how much each person has to pay
//From the whole bill, and tip


import java.util.Scanner; //imports

public class Check {
       public static void main(String[] args) {
           
           Scanner checkInput = new Scanner(System.in); //Declaration
           //
           //Asks user to input amount of check
           System.out.print("Enter the original amount of the check: ");
           double checkCost = checkInput.nextDouble(); //checkCost is the used variable
           //
           //Asks user to input amount of tip
           System.out.print("Enter the percentage of tip you want to pay as a whole numer: ");
           double tipPercent = checkInput.nextDouble(); //tipPercent is the used variable
           tipPercent /= 100;
           //
           //Asks user to input amount of people
           System.out.print("Enter the amount of people who went to dinner: ");
           int numPeople = checkInput.nextInt(); //numPeople is the used variable
           double totalCost, costPerPerson; //This makes the variables totalCost, and costPerPerson double
           int dollars, dimes, pennies; //this makes the variable dollars, dimes, and pennies integers
           //
           totalCost = checkCost*(1+tipPercent); //calculation for total cost
           costPerPerson = totalCost/numPeople; // calculation for cost per person
           dollars = (int)costPerPerson; // makes costPerPerson an integer
           dimes = (int)(costPePerrson*10)%10; //makes it so the dime is the .1 value
           pennies = (int)(costPerPerson*100)%10; //makes it so the penny is the .01 value
           //
           //prints out final answer
           System.out.println("Each person in the group owes $"+dollars+'.'+dimes+pennies);
           
           
           
    }  //end of main method   
} //end of class