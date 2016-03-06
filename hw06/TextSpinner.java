//Kobe Miller
//3-5-16
//hw06
//This is will simulate a rotating line
//it is an infinite loop that never stops

public class TextSpinner {
       public static void main(String[] args) {
           //
           //the while loop will ensure the program keeps running
           while(true)
           {
               //prints out /,-,\,|, and /. After each symbol is printed, it is deleted
               //so the next symbol can be printed
               //and so one
               System.out.print("/");
               System.out.print("\b");
               System.out.print("-");
               System.out.print("\b");
               System.out.print("\\");
               System.out.print("\b");
               System.out.print("|");
               System.out.print("\b");
               System.out.print("/");
               System.out.print("\b");
               
           }
    }  //end of main method   
} //end of class