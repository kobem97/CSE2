//Kobe Miller
//March 28, 2016
//hw09
//Rectangularize
//this program will take either number or int
//if its an int, it will make a square out of %, the length and height will be equal to the int
//it its a string, it will print the word out every line until
//there is the same amount of lines as there are letter in a word
import java.util.Scanner;

public class Rectangularize {
    //method called rect
    public static void rect(String word)
    {
        //how ever long the word is equal to x, it will print that word
        //x amount of times on a new line
        for (int i = 1; word.length() > i; i++)
        {
            System.out.println(word);
        }
    }//end of rect method
    //method called rect
    public static void rect(int num)
    {
        //what ever the int is equal to num
        //it will print that int num times across
        //and num times down
        for (int i = 0; num > i; i++)
        {
            for (int j = 0; num > j; j++)
            {
                System.out.print("%");
            }
            System.out.println("");
        }
    }//end of rect method
    public static void main(String[] args)
    {
        //new scanner called checkInputer
        Scanner checkInput = new Scanner(System.in);
        //try catch statement to check if its an int or a string
        try 
        {
            System.out.println("Please enter an input that is a number or word: ");
            int input = checkInput.nextInt();
            rect(input);
            
        } 
        catch(Exception e) 
        {
            String input = checkInput.nextLine();
            rect(input);
        }//end of catch
    }//end of main method
}//end of public class