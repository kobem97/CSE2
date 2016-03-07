//Kobe Miller
//3-5-16
//hw06
//This is a basic calculator that calculates factorials
//it will factor any number between 9 and 16
//it will not factor anything else
//including anything that isn't an integer


import java.util.Scanner; //imports

public class RunFactorial {
       public static void main(String[] args) {
           //declares checkFactorial as an int equal to 0
           int checkFactorial = 0;
           //
           //a while loop to keep the loop going until user inputs correct numbers
           while(true)
           {
               //creats a runFactorial class that is an integer
               Scanner runFactorial = new Scanner(System.in); //Declaration
               //
               //the try will ask user to input an integer a number 9-16
               try
               {
                   System.out.println("Please input an integer between 9 and 16: ");
                   //nextInt will throw Exception
                   //if the next token does not match the Integer
                   //regular expression, or is out of range
                   //creates checkFactorial
                   checkFactorial=runFactorial.nextInt();
               }
               //
               //catch will catch anything that is not an integer
               catch(Exception e)
               {
                   //black catch in order to continue to the print
               }
               //
               //if the numbers are out of range
               if (checkFactorial<9 || checkFactorial>16)
               {
                   //it will print this
                   System.out.println("Invalid input! Enter again!");
               }
               //if number is okay
               else
               {
                   //it will print the checkFactorial
                   System.out.print("Input accepted: "+(checkFactorial)+"!");
                   //this ends the while loop
                   break;
               }
           }
           //declares that factorial is an integer equal to 1
           int factorial = 1;
           //
           //while will run until checkFactorial is equal to 0
           while(checkFactorial>0)
           {
               //equation
               factorial = factorial * checkFactorial;
               //decreases the value of checkFactorial
               checkFactorial--;
               //reruns until while statement is complete (checkFactorial is equal to 0)
           }
           //
           //once the while loop is complete and the calculations are made
           //factorial is fully updates
           //prints out = and final number of factorial
           System.out.println(" = "+(factorial));
    }//end of main method   
} //end of class