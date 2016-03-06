//Kobe Miller
//2-12-16
//lab03
//This is a basic calculator
//It will find how much each person has to pay
//From the whole bill, and tip


import java.util.Scanner; //imports

public class RunFactorial {
       public static void main(String[] args) {
            int checkFactorial = 0;
            
           //Asks user to input amount of check
           while(true) 
           {
               Scanner runFactorial = new Scanner(System.in); //Declaration
               System.out.print("Please enter an integer that is between 9 and 16: ");
                checkFactorial = runFactorial.nextInt();
               if (checkFactorial<=9 || checkFactorial>=16 || checkFactorial%1 !=0)
               {
                   System.out.println("Invalid input! Enter again!");
               }
               else
               {
                   System.out.print("Input accepted: "+(checkFactorial)+"!");
                   break;
               }
               
               
           }
           int factorial = 1;
           
               while(checkFactorial>0)
               {
                   factorial = factorial * checkFactorial;
                   checkFactorial--;
               }
               System.out.println(" = "+(factorial));
    }//end of main method   
} //end of class