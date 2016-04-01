//Kobe Miller
//Lab09
//Creates sentences
//March 25, 2016

import java.util.Scanner;
import java.util.Random;

public class SenGen{
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Random randomGen = new Random();
        while(true){
            System.out.println("The " + Adjective() + " " + Subject() + " " + Verb() + " by the " + Adjective() + " " + Obj() + "." );
            System.out.print("Would you like to print another sentence[N = 0/ Y = 1]:");
            while (!myScanner.hasNextInt()){ 
                myScanner.next();
            }
            int repeat = myScanner.nextInt();
            
            if(repeat == 0){
                break;
            }
            else if (repeat < 0 || repeat > 1){
                System.out.println("That is invalid input. Enter 0 to quit, enter 1 to print another sentence.");
                break;
            }
        }
    }//End of Method
    public static String Adjective(){
        //Assignment statement to generate a random number less than 10, then store it in randomInt
        Random randomGen = new Random();
        int randomInt = randomGen.nextInt(10);
        
        switch (randomInt){
            case 0:
                return("dark venetian red");
            case 1:
                return("blush");
            case 2:
                return("orange");
            case 3:
                return("sienna");
            case 4:
                return("lilac");
            case 5:
                return("mahogany");
            case 6:
                return("cyan");
            case 7:
                return("scarlet");
            case 8:
                return("areo");
            case 9:
                return("fuchsia");
            default:
                return("tan");
        }
    }//End of Method Adjective
    public static String Subject(){
        //Assignment statement to generate a random number less than 10, then store it in randomInt
        Random randomGen = new Random();
        int randomInt = randomGen.nextInt(10);
        
        switch (randomInt){
            case 0:
                return("professor");
            case 1:
                return("student");
            case 2:
                return("gazelle");
            case 3:
                return("bird");
            case 4:
                return("mole rat");
            case 5:
                return("ostrich");
            case 6:
                return("alpaca");
            case 7:
                return("emu");
            case 8:
                return("hermit crab");
            case 9:
                return("round worm");
            default:
                return("ocelot");
        }
    }//End of Method Subject
    public static String Verb(){
        //Assignment statement to generate a random number less than 10, then store it in randomInt
        Random randomGen = new Random();
        int randomInt = randomGen.nextInt(10);
        switch (randomInt){
            case 0:
                return("sped");
            case 1:
                return("ran");
            case 2:
                return("boogied");
            case 3:
                return("pranced");
            case 4:
                return("zoomed");
            case 5:
                return("hustled");
            case 6:
                return("raced");
            case 7:
                return("flew");
            case 8:
                return("meandered");
            case 9:
                return("crawled");
            default:
                return("silent toed");
        }
    }//End of Method Verb
    public static String Obj(){
        //Assignment statement to generate a random number less than 10, then store it in randomInt
        Random randomGen = new Random();
        int randomInt = randomGen.nextInt(10);
        switch (randomInt){
            case 0:
                return("castle");
            case 1:
                return("cannon");
            case 2:
                return("lake");
            case 3:
                return("resturant");
            case 4:
                return("delorian");
            case 5:
                return("counter");
            case 6:
                return("garage");
            case 7:
                return("pool");
            case 8:
                return("pile of sticks");
            case 9:
                return("dorm");
            default:
                return("pit");
        }
    }//End of Method Obj
} //End of Class