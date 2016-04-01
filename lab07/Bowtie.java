//Kobe Miller
//2-12-16
//lab03
//This is a basic calculator
//It will find how much each person has to pay
//From the whole bill, and tip




public class Bowtie {
       public static void main(String[] args) {
           int nStars = 9;
           for (nStars = 5; nStars>=1; nStars--)
           {
               for (int i=0; i<5-nStars; i++)
               {
                   System.out.print(" ");
               }
               for (int i = (2-nStars); i<(2-nStars)+(2*nStars-1); i++)
               {
                   System.out.print("*");
               }
               System.out.print("\n");
               if (nStars <1)
               {
                   
               }
           }
    }  //end of main method   
} //end of class