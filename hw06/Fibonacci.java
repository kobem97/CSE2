//Kobe Miller
//3-5-16
//hw06
//This is a basic calculator
//It will find how much each person has to pay
//From the whole bill, and tip


import java.util.Scanner; //imports

public class Fibonacci {
       public static void main(String[] args) {
           while(true)
           {
           Scanner checkInput = new Scanner(System.in); //Declaration
           //
           System.out.print("Enter the first number in the sequence: ");
           int a1 = checkInput.nextInt();
           
           System.out.print("Entire the second number in the sequence: ");
           int a2 = checkInput.nextInt();
           int inter = a2;
           
           System.out.print("How many custom Fibonacci numbers should be printed? ");
           int n = checkInput.nextInt();
           
           if (a1<=0 || a2<=0 || n<=0)
           {
               System.out.println("You cannot enter 0 or a negative values");
           }
           
           else if (n==1)
           {
               System.out.println("The number is: "+a1+".");
           }
           else if (n==2)
           {
               System.out.println("The numbers are: "+a1+", "+a2+".");
           }
           else 
           {
               int count;
               count = 3;
               System.out.print("The numbers are: " + a1 + ", ");
               System.out.print(a2);
               
               for (count=3; n>=count; count++)
               {
                   inter = a1 + a2;
                   System.out.print(", " + inter);
                   a1 = a2;
                   a2 = inter;
               }
               System.out.print(".\n");
               break;
           
           
           }
           }
           
    }  //end of main method   
} //end of class