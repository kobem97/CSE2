//Kobe Miller
//2-11-16
//hw03
//This program will ass user to input lenght, width, and height to solve for a Pyramid Volume

import java.util.Scanner; //Imports a new class

public class Pyramid {
    public static void main(String[] args) {
    	//Declaration
    	Scanner pyramidInputs = new Scanner(System.in);
    	//User inputs length
    	System.out.println("Enter length: ");
    	double length = pyramidInputs.nextDouble();
    	//User inputs width
    	System.out.println("Enter width: ");
    	double width = pyramidInputs.nextDouble();
    	//User inputs height
    	System.out.println("Enter height: ");
    	double height = pyramidInputs.nextDouble();
    	//Set my variable to be a double
    	double volume;
    	//Equation for volume of a pyramid
    	volume = (length*width*height)/3;
    	//Spits out the beautiful reasults
    	System.out.println("The volume of the pyramid is "+volume);

           
    }  //end of main method   
} //end of class