//Kobe Miller
//lab11
//28-April-2016

//imports the scanner
import java.util.Scanner;
import java.util.Random;

public class lab11{
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Random randomGen = new Random();
        
        int arraylength = 50;
        int max1 = 0;
        int max2 = 0;
        int min1 = 0;
        int min2 = 0;
        
        int []array1 = new int[arraylength];
        int []array2 = new int[arraylength];
        
        for(int i=0; i < array1.length; i++){
            array1[i] = randomGen.nextInt(100);
        }
        
        for(int i = 0; i < array1.length; i++){
            if(array1[i] <= array1[min1]){
                min1 = i;
            }
            
            if(array1[i] >= array1[max1]){
                max1 = i;
            }    
        }
        System.out.println("The max value of array 1 is: " + "\t" + array1[max1] + "\nThe min value of array 1 is:  " + "\t" + array1[min1]);
        
        
        for(int i=0; i < array2.length; i++){
            if(i == 0){
            array2[i] = randomGen.nextInt(100);
            }
            else{
            array2[i] = randomGen.nextInt(100) + array2[i-1];
            }
            System.out.print(array2[i] + " ");
        }
        
        for(int i = 0; i < array2.length; i++){
            if(array2[i] <= array2[min2]){
                min2 = i;
            }
            
            if(array2[i] >= array2[max2]){
                max2 = i;
            }    
        }    
        System.out.println("\nI printed the above numbers on purpose so when you test the program, you can see which numbers are generated. Thus you can choose a number that was actually generated, if you wanted");
        System.out.println("The max value of array 2 is: " + "\t" + array2[max2] + "\nThe min value of array 2 is: " + "\t" + array2[min2]);

        
        System.out.print("Enter an integer to greater than 0: ");
        while (!myScanner.hasNextInt()){
            myScanner.next();
            System.out.println("You have entered invalid input.");
            return;
        }
        int input = myScanner.nextInt();
        if(input < 0){
            System.out.println("You have entered invalid input.");
            return;
        }
        
        int low = 0;
        int high = array2.length - 1;
        int target = 0;
        target = (low + high) / 2;
        while (low <= high) {
            
            if (array2[target] > input) {
                high = target - 1;
            } 
            else{
                low = target + 1;
            }
            target = (low + high) / 2;
        }
        
        if (input == array2[target]){
        System.out.println("The input " + input + " was found.");
        }
        else{
            System.out.println("The input " + input + " was not found. \nThe two closest numbers were " + array2[target] + " and " + array2[target + 1]);
        }
    }  //End of Method   
} //End of Class