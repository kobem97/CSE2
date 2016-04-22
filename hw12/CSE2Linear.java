//Kobe Miller
//HW12
//4/18/2016
//Asks user to input 15 numbers in order between 0 and 100
//then ask user to search of int
//Prints out how many times it took to find it
//shuffles array and repeats

import java.util.Scanner;
import java.util.Arrays;

public class CSE2Linear{
       public static void main(String[] args){
            Scanner myScanner = new Scanner(System.in);
                int totalGrade = 15;
                int grades[] = new int[totalGrade];
                int temp = 0;
                int i = 0;
                int inter = 0;
                System.out.print("Enter 15 int 0-100, in increasing order: ");
                //Makes sure numbers are in increasing order
                while(i < totalGrade){
                    while (!myScanner.hasNextInt())
                    {
                    myScanner.next();
                    System.out.println("invalid input. Please enter an integer.");
                    }
                    temp = myScanner.nextInt();
                    if(temp < 0 || temp > 100)
                    {
                        System.out.println("Please enter an integer between 0 and 100.");
                    }
                    //Then stored
                    else{
                        grades[i] = temp;
                        //if numbers are wrong, it prints this
                        if(i > 0 && temp < grades[i-1])
                        {
                            System.out.println("The integers must be in increasing order.");
                            i--;
                        }
                        i++;
                    }
                }
                //Prints user input
                System.out.println("User Input: ");
                for(i = 0; i < grades.length; i++)
                {
                    System.out.print(grades[i] + " ");
                }
                System.out.println("");
                //Search array
                System.out.print("Please enter an integer to be searched for 0 - 100: ");
                while (!myScanner.hasNextInt())
                {
                    myScanner.next();
                    System.out.println("Invalid input. Please enter an int.");
                }
                int target1 = myScanner.nextInt();
                System.out.println("You entered " + target1);
                int low = 0;
                int high = grades.length - 1;
                int mid = 0;
                int counter = 0;
                while (low <= high)
                {
                    mid = (low + high) / 2;
                    if (grades[mid] > target1) 
                    {
                        high = mid - 1;
                    }
                    else if (grades[mid] < target1) 
                    {
                        low = mid + 1;
                    }
                    counter++;    
                }
                if (target1 == grades[mid])
                {
                    System.out.print(target1 + " was found after " + counter + " iterations." );
                }
                else
                {
                    System.out.println(target1 + " was not found after " + counter + " iterations." );
                }    
                //Scrambles array
                for (i=0; i<grades.length; i++)
                {
        	       int target = (int) (grades.length * Math.random());
        	                inter = grades[target];
        	                grades[target] = grades[i];
        	                grades[i] = inter;
                }
                //Prints new array   
                System.out.println("Scrambled: ");        
                for(i = 0; i < grades.length; i++)
                {
                    System.out.print(grades[i] + " ");
                }
                System.out.println("");  
                //Asks for int to be searched
                System.out.print("Enter an integer to be searched for 0 - 100: ");
                while (!myScanner.hasNextInt())
                {
                    myScanner.next();
                    System.out.println("Invalid input. Please enter an int.");
                }
                    int target2 = myScanner.nextInt();
                    System.out.println("You entered " + target2);
                //Print found int 
                for(i = 0; i < grades.length; i++)
                {
                    if(grades[i] == target2)
                    {
                        System.out.println(target2 + " was found after " + i + " iterations.");
                        break;
                    } 
                    else if(i == 14)
                    {
                        System.out.println(target2 + " was not found after " + (i+1) + " iterations.");
                    }
                }
    }//End of Main Method
} //End of Class