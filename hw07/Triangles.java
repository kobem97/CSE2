//Kobe Miller
//HW07
//Utilizes various different looping structures
//21-March-2016

import java.util.Scanner;

public class Triangles{
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
        while(true){
            //user input andrestricted to 5-30
            System.out.print("Enter an integer between 5 and 30:");
            while (!myScanner.hasNextInt())
            { 
                myScanner.next();
            }
            int input = myScanner.nextInt();
            //
            //Check input to make sure it is within range before running 
            if(input < 5 || input > 30)
            {
                System.out.println("You have entered invalid input. Please enter an integer between 5 and 30.");
            }
            else{
                System.out.println("For Loop:");
                //loop that prints out the top of the triangle and includes the middle row
                for(int j = 1; j <= input; j++)
                {
                    for(int i = 1; i <= j; i++)
                    {
                        System.out.print(j);
                    }
                System.out.print("\n");
                }
                //loop that prints bottom of triangle and starts after middle row
                for(int j = 1; j <= (input - 1); j++)
                {
                    for(int i = 1; i <= (input-j); i++)
                    {
                        System.out.print((input - j));
                    }
                System.out.print("\n");
                }
                System.out.println("While Loop:");
                //Initialization of counter variables
                int j = 1;
                int i = 1;
                //
                //loop that prints out the top of the triangle and includes the middle row
                while(j <= input)
                {
                    while(i <= j)
                    {
                        System.out.print(j);
                        //increment
                        i++;
                    }
                i = 1;
                j++;    
                System.out.print("\n");
                }
                //
                //reinitializes at 1 since the same variables are being used to increment
                j = 1;
                i = 1;
                //
                //loop thaat prints bottom of triangle and starts after middle row
                while(j <= (input-1))
                {
                    while(i <= (input - j))
                    {
                        System.out.print(input-j);
                        i++;
                    }
                i = 1;
                j++;    
                System.out.print("\n");
                }
                System.out.println("Do-While Loop:");
                //Again, must reinitialize
                i = 1;
                j = 1;
                //
                //loop that prints out the top of the triangle and includes the middle row
                do{
                        do{
                            System.out.print(j);
                            i++;
                        }while(i <= j);
                    i = 1;
                    j++;    
                    System.out.print("\n");
                }while(j <= input);
                i = 1;
                j = 1;
                do{
                        do{
                            System.out.print(input - j);
                            i++;
                        }while(i <= (input - j));
                    i = 1;
                    j++;    
                    System.out.print("\n");
                }while(j <= (input-1));
            break;
            }
        }
        
    }  //End of Method   
} //End of Class
