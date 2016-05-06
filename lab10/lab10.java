//Kobe Miller
//lab10
//25-April-2016

//imports the scanner

import java.util.Scanner; 
import java.util.Random;

public class lab10{
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Random randomGen = new Random();
        
        int randomStudents = (randomGen.nextInt(5) + 5);
        
        String []students = new String[randomStudents];
        int []midterm = new int[randomStudents];
        
        System.out.println("Please enter "+randomStudents+" student names!");
        
        for(int i = 0; i < randomStudents; i++){
            System.out.print("Name of the student "+(i+1)+": ");
            students[i] = myScanner.nextLine();
        }
        
        for(int i = 0; i < randomStudents; i++){
           midterm[i] = randomGen.nextInt(100);
        }
        
        for(int i = 0; i < randomStudents; i++){
            System.out.println(students[i]+":" + "\t" + midterm[i]);
        }
    }  //End of Method   
} //End of Class