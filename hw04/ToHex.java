//Kobe Miller
//2-19-16
//lab03
//This is a basic calculator
//It will find how much each person has to pay
//From the whole bill, and tip

import java.util.Scanner; //imports


public class ToHex {
       public static void main(String[] args) {
           
           Scanner colorInput = new Scanner(System.in); //Declaration
           int hexRed, hexGreen, hexBlue, hexRedRemain, hexGreenRemain, hexBlueRemain;
           //
           //Asks user to input red
           System.out.print("Enter the amount for red 0-255: ");
           int colorRed = colorInput.nextInt();
           hexRed = colorRed/16
           hexRedRemain = colorRed%16
           if (hexRedRemain>=10)
           {
               if (hexRedRemain==10)
               {
                   hexRedRemain=A;
               }
               if (hexRedRemain==11)
               {
                   hexRedRemain=B;
               }
               if (hexRedRemain==12)
               {
                   hexRedRemain=C;
               }
               if (hexRedRemain==13)
               {
                   hexRedRemain=D;
               }
               if (hexRedRemain==14)
               {
                   hexRedRemain=E;
               }
               if (hexRedRemain==15)
               {
                   hexRedRemain=F;
               }
           }
           //
           //Asks user to input green
           System.out.print("Enter the amount for green 0-225: ");
           int colorGreen = colorInput.nextInt();
           hexGreen = colorGreen/16
           hexGreenRemain = colorGreen%16
           if (hexGreenRemain>=10)
           {
               if (hexGreenRemain==10)
               {
                   hexGreenRemain=A;
               }
               if (hexGreenRemain==11)
               {
                   hexGreenRemain=B;
               }
               if (hexGreenRemain==12)
               {
                   hexGreenRemain=C;
               }
               if (hexGreenRemain==13)
               {
                   hexGreenRemain=D;
               }
               if (hexGreenRemain==14)
               {
                   hexGreenRemain=E;
               }
               if (hexGreenRemain==15)
               {
                   hexGreenRemain=F;
               }
           }
           //
           //Asks user to input blue
           System.out.print("Enter the amount for blue 0-225: ");
           int colorBlue = colorInput.nextInt();
           hexBlue = colorBlue/16
           hexBlueRemain = colorBlue%16
           if (hexBlueRemain>=10)
           {
               if (hexBlueRemain==10)
               {
                   hexBlueRemain=A;
               }
               if (hexBlueRemain==11)
               {
                   hexBlueRemain=B;
               }
               if (hexBlueRemain==12)
               {
                   hexBlueRemain=C;
               }
               if (hexBlueRemain==13)
               {
                   hexBlueRemain=D;
               }
               if (hexBlueRemain==14)
               {
                   hexBlueRemain=E;
               }
               if (hexBlueRemain==15)
               {
                   hexBlueRemain=F;
               }
           }
           if (colorRed>255 || colorRed<0
               colorGreen>255 || colorGreen<0
               colorBlue>255 || colorBlue<0)
               {
                   System.out.println("You cannot enter invalid values!")
               }
               
               System.out.println(hexRed+hexRedRemain+hexGreen+hexGreenRemain+hexBlue+hexBlueRemain);
           
    }  //end of main method   
} //end of class