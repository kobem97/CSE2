//Kobe Miller
//2-12-16
//lab03
//This is a basic calculator
//It will find how much each person has to pay
//From the whole bill, and tip
import java.util.Scanner;

public class Scramble {

    public static int[] resize (int[] myArray, int newSize) {   
        
        int copyArray [] = new int [newSize];
        
        if (newSize < myArray.length)
        {
            for (int i = 0; i<copyArray.length; i++)
            {
                copyArray[i] = myArray[i];
                System.out.println("copyArray: " + copyArray[]);
            }
        }
        if (newSize > myArray.length)
        {
            for (int i = 0; i<copyArray.length; i++)
            {
                if (i < myArray.length)
                {
                    for (int i = 0; i<copyArray.length; i++)
                    {
                        copyArray[i] = myArray[i];
                    System.out.println("copyArray: " + copyArray[]);
                    }
                }
                if (i <= myArray.length)
                {
                    for (int i = myArray.length; i < copyArray.length; i ++)
                    {
                        copyArray[i] = 0;
                    }
                }
            }
        }
        
        


    }
    public static void main(String[] args){
        
        
        
        
        
        
        
    }
}