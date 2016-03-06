//Kobe Miller
//3-4-16
//twist is rotate how many times you want to


import java.util.Scanner; //imports

public class Twist {
       public static void main(String[] args) {
           //
           //creates checkTwist
           Scanner checkTwist = new Scanner(System.in); //Declaration
           //
           //asks user length of twist
           System.out.print("Enter the length of the twist: ");
           int checkLength = checkTwist.nextInt();
           //creats twist that is equal to checklength/3
           int twist = (checkLength/3);
           //modulus that finds remainder of checkLength by 3
           //part twist is equal to the modulus and is an integer
           int partTwist = (checkLength%3);
           //count will be used as increment
           int count = 1;
           //while will loop until count is equal to twist
           while (count <= twist)
           {
               System.out.print("\\ /");
               count++;
           }
               //if remainder is 0, it ends
               if (partTwist == 0)
               {
                   System.out.printf("\n");
                   count = 1;
               }
               //if remainder is 1, it adds a "\" before ending
               else if (partTwist == 1)
               {
                   System.out.print("\\");
                   System.out.printf("\n");
                   count = 1;
               }
               //if remainder is 2, it adds a "\ " before ending
               else if (partTwist == 2)
               {
                   System.out.print("\\ ");
                   System.out.printf("\n");
                   count = 1;
               }
               //same while just with second line
               while (count <= twist)
               {
                   System.out.print(" X ");
                   count++;
               }
               
               if (partTwist == 0)
               {
                   System.out.printf("\n");
                   count = 1;
               }
               
               else if (partTwist == 1)
               {
                   System.out.print(" ");
                   System.out.printf("\n");
                   count = 1;
               }
               
               else if (partTwist == 2)
               {
                   System.out.print(" X ");
                   System.out.printf("\n");
                   count = 1;
               }
               //same while loop just with third line
               while (count <= twist)
               {
                   System.out.print("/ \\");
                   count++;
               }
               
               if (partTwist == 0)
               {
                   System.out.printf("\n");
                   count = 1;
               }
               
               else if (partTwist == 1)
               {
                   System.out.print("/");
                   System.out.printf("\n");
                   count = 1;
               }
               
               else if (partTwist == 2)
               {
                   System.out.print("/ ");
                   System.out.printf("\n");
                   count = 1;
               }
           
    }  //end of main method   
} //end of class