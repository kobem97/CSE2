//Kobe Miller
//hw07
//Twisty
//21-March-2016

//imports the scanner
import java.util.Scanner;

//creates the class
public class array{ 
    //main method 
    public static void main(String [] args){
        Scanner myScanner = new Scanner(System.in);
        int studentSize = (int)((Math.random()* (10 - 5 + 1)) + 5);
        String [] students = new String[studentSize];
        int [] midterm = new int[studentSize]
        System.out.println("Please enter "+studentSize+" names:");
        for(int i = 0; i < studentSize; i++){
            String studentNames = myScanner.nextLine();
        }
        
    }
}