//Kobe Miller
//3-5-16
//hw06
//This is a basic calculator that calculates Fibonacci numbers
//Enter first two numbers of sequence
//then how many numbers you want from the sequence


import java.util.Scanner; //imports scanner

public class Fibonacci {
       public static void main(String[] args) {
           //
           //Runs a loop until a break, or is false
           while(true)
           {
               Scanner checkInput = new Scanner(System.in); //Declaration
               //
               //asks user for first number
               System.out.print("Enter the first number in the sequence: ");
               //sets a1 as an integer
               int a1 = checkInput.nextInt();
               //
               //asks user for second number
               System.out.print("Entire the second number in the sequence: ");
               //set a2 as an integer
               int a2 = checkInput.nextInt();
               //makes inter equal to a2 for future fibonacci sequence
               int inter = a2;
               //
               //asks user how many numbers should be printed
               System.out.print("How many custom Fibonacci numbers should be printed? ");
               //sets n as an integer
               int n = checkInput.nextInt();
               //
               //makes sure if user uses a positive number
               if (a1<=0 || a2<=0 || n<=0)
               {
                   System.out.println("You cannot enter 0 or a negative values");
                   
               }
               //
               //if user says they want one number, the program prints out only one
               else if (n==1)
               {
                   System.out.println("The number is: "+a1+".");
                   
               }
               //
               //if user says they want two numbers, the program prints out two
               else if (n==2)
               {
                   System.out.println("The numbers are: "+a1+", "+a2+".");
                   
               }
               //
               //if anything else other than 1 or 2, it continues the program
               else
               {
                   //declares count
                   int count;
                   //count is three because three numbers are already assigned
                   count = 3;
                   //prints the first number with comma
                   System.out.print("The numbers are: " + a1 + ", ");
                   //prings second number
                   System.out.print(a2);
                   //since the count is 3, it will incriment one and then go through the program
                   //it will continue to do so until count is = or > than n
                   for (count=3; n>=count; count++)
                   {
                       //equations
                       inter = a1 + a2;
                       //
                       //prints comma and inter
                       System.out.print(", " + inter);
                       //equations
                       a1 = a2;
                       a2 = inter;
                       
                   }
                   //completes cycle with a period
                   System.out.print(".\n");
                   //ends the while loop
                   break;
                   
               }
               
           }
           
       }  //end of main method   
} //end of class