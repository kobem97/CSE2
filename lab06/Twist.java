//Kobe Miller
//2-12-16
//lab03
//This is a basic calculator
//It will find how much each person has to pay
//From the whole bill, and tip


import java.util.Scanner; //imports

public class Twist {
       public static void main(String[] args) {
           
           Scanner checkTwist = new Scanner(System.in); //Declaration
           System.out.print("Enter the length of the twist: ");
           int checkLength = checkTwist.nextInt();
           int count = 1;
           while (checkLength >= count)
           {
               
               if (((count/3)%3) == 0)
               {
                   System.out.printf("\\ /");
                   count++
                   
               }
               if (((count/3)%3) == 1)
               {
                   System.out.printf("\\");
                   count++;
                   
               }
               if (((count/3)%3) == 2)
               {
                   System.out.printf("/");
                   count++;
                   
               }
           
           }
           
           
           
    }  //end of main method   
} //end of class