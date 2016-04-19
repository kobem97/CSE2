//Kobe Miller
//hw12
//april 18, 2016
//RemoveElements

import java.util.Scanner;
import java.util.Random;

public class RemoveElements{
  public static void main(String [] arg){

    //Given code which served as the basis for subsequent methods  
	Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    int newArray1[];
    int newArray2[];
    int index,target;
	String answer="";
	//
	//do statement
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
  	//
    //index
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
  	//
    //target value
    System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
	//go again ot not
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
 
public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
    }  //End of Method

//Method genereate random int 0-9 
public static int[] randomInput(){
    //First, allocated space for an array for 10 units
    int random[] = new int[10]; 
    Random randomGen = new Random();
    //Loop to populate each array with random int between 0 and 9
    for(int i=0; i < 10; i++){
            random[i] = randomGen.nextInt(9);
    }
    //return to main
    return random; 
} //End of randomInput Method
public static int[] delete(int list[], int pos){
    //This method wil decrease in size by 1
    int deleted[] = new int[list.length - 1];
    //Loop goes from 0
    for(int i = 0; i < deleted.length; i++){
        //This controls statement
        if( i >= pos){
            deleted[i] = list[i+1];
        }
        else{
            deleted[i] = list[i];
        }
    }
    return deleted;
} //End of Method
    
public static int[] remove(int list[], int target){
    int hit = 0;
    int count = 0;
    //Small for loop to determine how many times user inputted target is found in the array, in order to dynamically allocate the array size regardless of number of occurances
    for(int i = 0; i < list.length; i++){
            if(list[i] == target){
                hit++;
            }
    }
    
    //New array being dynamically allocated based on the above for loop(i.e. the array shrinks accordingly regardless of how many numbers are being removed)
    int removed[] = new int[list.length - hit];
    
    //for loop to increment through the size of the dynamically allocated array
    for(int i = 0; i < removed.length; i++){
        //Control structure to shift the array being copied accordingly to how many occurances of the number appears. Every time the target is found, count increases by one,
        //thus shifting the array being copied over one, effectively removing the targeted number from the new array.
        if(list[i] == target){
                count++;
                removed[i] = list[i + count];
        }
        else{
            removed[i] = list[i + count];
        }
    }
    //The new array with the removed integers will then be returned to main
    return removed;
} //End of remove Method    
    
} //End of Class