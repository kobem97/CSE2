//Kobe Miller
//hw09
//Games
//25-March-2016
//This will have three mini games
//one is where you guess the box number
//one where you guess the color and number the wheel will spin on
//and the last one will scramble any word you input

//imports the scanner
import java.util.Scanner;

//creates the class
public class Games{
    // guessTheBox method
    public static void guessTheBox()
    {
        // numGen is an int that is equal to 0, just to initialize the variable
        int numGen = 0;
        // runs until a break, or is false
        //so when an error occurs, it runs through the program again
        //until compatiple numbers are entered
        while (true)
            {
                System.out.println("Choose a box between 1-3");
                System.out.println("If you choose correctly, you win a prize");
                System.out.println("If not, you lose!");
                //
                //randomizer of 1-3
                int boxGen = (int)((Math.random()*2)+1); //makes it so 0 isn't an option
                //
                //new scanner called myGuessTheBox
                Scanner myGuessTheBox = new Scanner(System.in);
                System.out.print("Input your desired box number: ");
                // num is an Int that is equal to the Scanner myGuessTheBox
                int num = myGuessTheBox.nextInt();
                // if the number you guessed matched the random number generator, you win
                if (num == boxGen)
                {
                    System.out.println("Congratulations! You won!");
                    System.out.println("Claim your prize at Beardslee 111");
                    System.out.println("Between the hours of 12:00pm-7:00pm Week days");
                    break; //stops the while program
                }
                //If you guess a number not in the intervals
                //it will print this out and make you try again
                else if (num > 3 || num < 1)
                {
                    System.out.println("You cannot guess a number higher than 3 or lower than 1!");
                    System.out.println("Try Again!");   
                }
                //if you guessed within the intervals, but not the right number
                //you lose
                else
                {
                    System.out.println("Sorry, you guessed incorrectly!");
                    break;//stops the while loop
                }
            }//end of while
    }//end of guessTheBox Method
    //method for spinTheWheel
    public static void spinTheWheel()
    {
        while (true)
        {
            //integer numGen is initialized
            int numGen = 0;
            System.out.println("Choose a color Black or Red");
            System.out.println("And choose a number 1-5");
            //randomizer from 1-2
            int colorGen = (int)((Math.random()*2)+1);
            String colorGen1 = "";
            String colorGen2 = "";
            //red option
            if (colorGen == 1)
            {
                colorGen1 = "Red";//if you capitalized Red
                colorGen2 = "red";//if you didn't
                //generates a number 1-5
                numGen = (int)((Math.random()*4)+1);
            }
            //black option
            if (colorGen == 2)
            {
                colorGen1 = "Black";//if you capitalized Black
                colorGen2 = "black";//if you didn't
                //generates a number 1-5
                numGen = (int)((Math.random()*4)+1);
            }
            //new scanner called mySpinColor
            Scanner mySpinColor = new Scanner(System.in);
            System.out.print("Input your desired color: ");
            //color is a string equal to mySpinColor
            String color = mySpinColor.nextLine();
            //new scanner called mySpinNum
            Scanner mySpinNum = new Scanner(System.in);
            System.out.print("Input your desired number: ");
            //int num is equal to mySpinNum
            int num = mySpinNum.nextInt();
            
            //if you guess correctly, you win
            if ((color.equals(colorGen1)) || (color.equals(colorGen2)) && num == numGen)
            {
                System.out.print("The wheel has spun, and it matches your ");
                System.out.println("combo of "+color+" "+num+" Congratulations!");
                break;
            }
            //if you guess incorrectly, you lose and show what the wheel spun
            if ((!(color.equals(colorGen1))) && (!(color.equals(colorGen2))) || ((num != numGen)))
            {
                System.out.print("The wheel has spun, and it doesn't match your ");
                System.out.println("combo of "+color+" "+num+" the wheel spun "+colorGen1+" "+numGen);
                break;
            }
            if (num<1 || num>5)
            {
                System.out.println("Please enter a number between 1-5, try again!");
            }
        }
    }//end of spinTheWheel Method
    //scramble method
    public static String scrambler(String str) 
    {   
        //stringBuilder in order to help organize the string
        //and so whatever the user inputs, that string becomes mutable
        StringBuilder newString = new StringBuilder();
        StringBuilder string = new StringBuilder(str);
        //while the lenth of the string is bigger than zero
        //it will randomize the order of the string
        while (string.length() > 0) 
        {
            //randomizer to mix the letters of the string
            int s = (int)(Math.random() * string.length());
            //the append will alter the internal char array
            //instead of creating a whole new string
            newString.append(string.charAt(s));
            //deletes where ever the old addition was to keep the length 
            //of the string the same
            string.deleteCharAt(s);
        }
        //return the final value of the string
        return newString.toString();
    }//end of scrambler method
    //main method 
    public static void main(String [] args){

        System.out.println("#*##*##*##*##*##*##*##*##*##*##*##*#");
        System.out.println("*#**#**#**#**#**#**#**#**#**#**#**#*");
        System.out.println("#                                  #");
        System.out.println("*  Welcome to Kobe's Game Center!  *");
        System.out.println("#                                  #");
        System.out.println("*#**#**#**#**#**#**#**#**#**#**#**#*");
        System.out.println("#*##*##*##*##*##*##*##*##*##*##*##*#");
        while (true)
        {
            System.out.println("Your options are: guessTheBox, spinTheWheel, or scrambler");
            //new Scanner called checkGame
            Scanner checkGame = new Scanner(System.in);
            System.out.print("Input your desired game: ");
            //game is a string equal to checkGame
            String game = checkGame.nextLine();//
            String guessTheBox = "guessTheBox";//initialize string
            String spinTheWheel = "spinTheWheel";//initialize string
            String scrambler = "scrambler";//initialize string
            //if what the user input equals guessTheBox, it will call guessTheBox method
            if (game.equals(guessTheBox))
            {
                guessTheBox();
                break;
            }
            //if what the user input equals spinTheWheel, it will call spinTheWheel method
            else if (game.equals(spinTheWheel))
            {
                spinTheWheel();
                break;
            }
            //if what the user input equals scrambler, it will call scrambler method
            else if (game.equals(scrambler))
            {
                //new Scanner scramble
                Scanner scramble = new Scanner(System.in);
                System.out.print("Input your desired word: ");
                //scrambled is a string equal to the Scanner scramble
                String scrambled = scramble.nextLine();
                //calls the method scrambler, and has scrambled literally scrambled
                System.out.println(scrambler(scrambled));
                break;
            }
            //if the user inputs anything else
            //it will print that we do not have what ever the user inputs
            //and then ends
            else if ((!(game.equals(guessTheBox))) && (!(game.equals(spinTheWheel))) && (!(game.equals(scrambler))))
            {
                System.out.println("We do not have "+ game);
                break;
            }
        }
    }//end of main method
}//end of main class