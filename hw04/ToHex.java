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
           //
           //Declaring said integers as said variables
           int hexRed, hexGreen, hexBlue, 
           hexRedRemain, hexGreenRemain, hexBlueRemain;
           //
           //initializing string variables
           String redLetter ="";
           String blueLetter = "";
           String greenLetter = "";
           //
           //
           //Asks user to input red
           System.out.print("Enter the amount for red 0-255: "); //asks user to input red
           int colorRed = colorInput.nextInt();
           //calculations
           hexRed = colorRed/16; 
           hexRedRemain = colorRed%16;
           if (hexRedRemain>=10)
           {
               if (hexRedRemain==10)
               {
                   redLetter="A";
               }
               else if (hexRedRemain==11)
               {
                   redLetter="B";
               }
               else if (hexRedRemain==12)
               {
                   redLetter="C";
               }
               else if (hexRedRemain==13)
               {
                   redLetter="D";
               }
               else if (hexRedRemain==14)
               {
                   redLetter="E";
               }
               else if (hexRedRemain==15)
               {
                   redLetter="F";
               }
           }
           //
           //Asks user to input green
           System.out.print("Enter the amount for green 0-225: ");
           int colorGreen = colorInput.nextInt();
           hexGreen = colorGreen/16;
           hexGreenRemain = colorGreen%16;
           if (hexGreenRemain>=10)
           {
               if (hexGreenRemain==10)
               {
                   greenLetter="A";
               }
               else if (hexGreenRemain==11)
               {
                   greenLetter="B";
               }
               else if (hexGreenRemain==12)
               {
                   greenLetter="C";
               }
               else if (hexGreenRemain==13)
               {
                   greenLetter="D";
               }
               else if (hexGreenRemain==14)
               {
                   greenLetter="E";
               }
               else if (hexGreenRemain==15)
               {
                   greenLetter="F";
               }
           }
           //
           //Asks user to input blue
           System.out.print("Enter the amount for blue 0-225: ");
           int colorBlue = colorInput.nextInt();
           hexBlue = colorBlue/16;
           hexBlueRemain = colorBlue%16;
           if (hexBlueRemain>=10)
           {
               if (hexBlueRemain==10)
               {
                   blueLetter="A";
               }
               else if (hexBlueRemain==11)
               {
                   blueLetter="B";
               }
               else if (hexBlueRemain==12)
               {
                   blueLetter="C";
               }
               else if (hexBlueRemain==13)
               {
                   blueLetter="D";
               }
               else if (hexBlueRemain==14)
               {
                   blueLetter="E";
               }
               else if (hexBlueRemain==15)
               {
                   blueLetter="F";
               }
           }
           
           
               //results wont print unless you stay in number range
               if ((colorRed<255 && colorRed>0) && 
               (colorGreen<255 && colorGreen>0) && 
               (colorBlue<255 && colorBlue>0))
               {
               System.out.println(hexRed + redLetter + hexGreen + greenLetter + hexBlue + blueLetter);
               }
               //if you go out of range, this will print
               else {
                   System.out.println("You cannont enter invalid numbers! ");
               }
               
               
           
    }  //end of main method   
} //end of class