//Kobe Miller
//2-6-16
//HW02
//Arithmatic will calculate cost of each item, tax, ect
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class example{
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Random randomGen = new Random();
       
        System.out.print("Enter the size of the array:");
       
        while (!myScanner.hasNextInt()){
                    myScanner.next();
                    System.out.println("Invalid input. Please enter an integer.");
        }
        int arraySize = myScanner.nextInt();
        
        //int[] sort =  new int[x];
       
        int[][] ragged = new int[arraySize][];
       
        for(int i = 0; i < arraySize; i++){
            int randomInt = randomGen.nextInt(arraySize - 2) + 1;
            ragged[i] = new int[randomInt];
        }
       
        System.out.println("Ragged Unsorted Array:");
       
        for(int i = 0; i < arraySize; i++){
            for(int j = 0; j < ragged[i].length; j++){
                int randy = randomGen.nextInt(20);
                ragged[i][j] = randy;
                System.out.print(ragged[i][j] + " ");
            }
            System.out.print("\n");
        }
       
        System.out.println("Ragged Sorted Array:");
       
        for(int i = 0; i < arraySize; i++){
            Arrays.sort(ragged[i]);
            for(int j = 0; j < ragged[i].length; j++){
                System.out.print(ragged[i][j] + " ");
            }
            System.out.print("\n");
            
        }
        
        System.out.println("Here is your rearranged array: ");
       
        for (int i = 0; i < ragged.length - 1; i++) {
            for (int j = i+1; j < ragged.length; j++) {
                if (ragged[i].length > ragged[j].length) {
                   int[] temp = ragged[i];
                   ragged[i] = ragged[j];
                   ragged[j] = temp;
                   //System.out.print(temp);
                }
            }
        }
        
        for(int i = 0; i < arraySize; i++){
            for(int j = 0; j < ragged[i].length; j++){
                System.out.print(ragged[i][j] + " ");
            }
            System.out.print("\n");
        }
       
        //Asks for int to be searched
        System.out.print("What number would you like to search for? ");
        while (!myScanner.hasNextInt())
        {
            myScanner.next();
            System.out.println("Invalid input. Please enter an int.");
        }
        
        int target1 = myScanner.nextInt();
        //Print found int 
        for(int i = 0; i < arraySize; i++){
            for(int j = 0; j < ragged[i].length; j++){
                if (ragged[i][j] == target1)
                {
                    System.out.println("Column "+ i + " Row " + j);
                    break;
                }
                else if (i == arraySize && j == ragged[i].length)
                {
                    System.out.println("Not in array");
                    break;
                }
            }
        }
       
       
    }  //End of Method  
} //End of Class