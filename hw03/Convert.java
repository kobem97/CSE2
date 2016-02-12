//Kobe Miller
//2-11-16
//hw03
//Promgram will convert meters to inches
import java.util.Scanner; //This is so I can import a new class

public class Convert {
       public static void main(String[] args) {

           Scanner metersInput = new Scanner(System.in); //Declaration
           System.out.println("Enter distance in meters: "); //What the user sees
           //whatever number the user uses, its used as a double
           double meters = metersInput.nextDouble(); 
           double converted; //Sets a variable
           //Conversion equation
           converted = meters*39.37;
           //Print the answer
           System.out.println(meters+" meters is "+converted+" inches ");
           

    }  //end of main method   
} //end of class