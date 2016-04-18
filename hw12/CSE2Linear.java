//Kobe Miller
//hw07
//Twisty
//21-March-2016

//imports the scanner
import java.util.Scanner; //Scanner is a new class
import java.util.Arrays;  //Arrays is a new class

public class CSE2Linear {
       public static void main(String[] args) {
            int numGrade = 15; //limits ho much user can input
            Scanner gradeInput = new Scanner(System.in); //Declaration
            try //as long as inputs are ints, program will run
            {
                int[] grades = new int[numGrade]; //import array
                System.out.print("Enter in 15 final grades: "); //What the user sees
                for(int i = 0; i < grades.length; i++) //Stores numbers for array
                {
                    grades[i] = gradeInput.nextInt();
                    int finalGrade = grades[i]; //Makes it so if statement can check grades
                    if (finalGrade<0 || finalGrade>100) //checks if its in bound
                    {
                        System.out.println("Invalid, must enter a number between 0 and 100");
                        return;
                    }
                }
                System.out.println("Sort: ");
                Arrays.sort(grades); //sorts the array
                System.out.println(" "+ Arrays.toString(grades)); //prints array
                System.out.println("Enter a grade to search for: ");
                int gradeCheck = gradeInput.nextInt(); // new scanner
                for (int i = 0; i < grades.length; i++){
                    if (gradeCheck == grades[i]) //if user input grade is equal to the grade in array, it will run this
                    {
                        int it = i + 1; //
                        System.out.println(gradeCheck + " was found in " + it + " iterations");  //found it! so we immediately exit the method
                        System.out.println("Scrambled; ");
                        for (i=0; i<grades.length; i++) {
        	                //find a random member to swap with
        	                int target = (int) (grades.length * Math.random()); //randomizes the order of array
        	                //swap the values
        	                int temp = grades[target]; //updates
        	                grades[target] = grades[i];
        	                grades[i] = temp; //updates
                        }
                        System.out.println(" "+ Arrays.toString(grades)); 
                        System.out.println("Enter a grade to search for: ");
                        gradeCheck = gradeInput.nextInt(); // user input to check for grade from randomized array
                        for (i = 0; i < grades.length; i++){
                            if (gradeCheck == grades[i])
                            {
                                it = i + 1;
                                System.out.println(gradeCheck + " was found in " + it + " iterations");  //found it! so we immediately exit the method
                                return;
                            }
                            if (i == 14 && gradeCheck != grades[i])
                            {
                                it = i + 1;
                                System.out.println(gradeCheck + " was not found in " + it + " iterations");
                                return;
                            }
                        }
                    }   
                    else if (i == 14 && gradeCheck != grades[i])
                    {
                        int it = i + 1;
                        System.out.println(gradeCheck + " was not found in " + it + " iterations");
                        System.out.println("Scrambled; ");
                        for (i=0; i<grades.length; i++) {
            	            //find a random member to swap with
            	            int target = (int) (grades.length * Math.random() );
            	            //swap the values
            	            int temp = grades[target];
            	            grades[target] = grades[i];
            	            grades[i] = temp;
                        }
                        System.out.println(" "+ Arrays.toString(grades));
                        System.out.println("Enter a grade to search for: ");
                        gradeCheck = gradeInput.nextInt();
                        for (i = 0; i < grades.length; i++){
                            if (gradeCheck == grades[i])
                                {
                                    it = i + 1;
                                    System.out.println(gradeCheck + " was found in " + it + " iterations");  //found it! so we immediately exit the method
                                    return;
                            }
                            if (i == 14 && gradeCheck != grades[i])
                            {
                                it = i + 1;
                                System.out.println(gradeCheck + " was not found in " + it + " iterations");
                                return;
                            }
                        }
                    }
                }
            }
                    
            catch(Exception e)
            {
                System.out.println("Invalid, must enter an int");
                //black catch in order to continue to the print
                
            }
 
        }
}