//Kobe Miller
//hw12
//april 18, 2016
//RemoveElements

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Holoporter{
    //so random method
    public static String [][][] soRandom(){
        int RanLen = (int)(Math.random() * 9);
        int RanLen2 = (int)(Math.random() * 9);
        int RanLen3 = (int)(Math.random() * 9);
        String [][][] Rando = new String[RanLen][][];
        for(int i = 0; i< RanLen; i++){
            Rando[i] = new String[RanLen][];
            for(int j = 0; j < RanLen2; j++){
                Rando[i][j] = new String[RanLen2];
                for(int k = 0; k < RanLen3; k++){
                    Rando[i][j][k] = new String();
                }
            }
        } 
        return Rando;
    }//End of SoRandom
    
    public static void sampling(String key) {
       Scanner scan = new Scanner(System.in);
       while(true){
           if(Character.isLetter(key.charAt(0)) && Character.isLetter(key.charAt(1)) && Character.isDigit(key.charAt(2)) && Character.isDigit(key.charAt(3)) && Character.isDigit(key.charAt(4)) && Character.isDigit(key.charAt(5)) && Character.isUpperCase(key.charAt(0)) && Character.isUpperCase(key.charAt(1))){ //////////////
       break;
           } else {
               System.out.println("Not a Valid Code");
               key = scan.next();
           }
        }
    }//End of sampling
    
    //coder method
    public static String coder(){
        String str = "";
        String str2 = "";
        String randomNum = "";
        String randomNum2 = "";
        String randomNum3 = "";
        String randomNum4 = "";
        String code = "";
        for(int i = 0; i<1; i++){
            int randomLetter = (int)((Math.random()*26)+97);
            char letter = (char) randomLetter;
            char upper = Character.toUpperCase(letter);
            str = "" + upper;
        }
        
        for(int i = 0; i<1; i++){
            int randomLetter = (int)((Math.random()*26)+97);
            char letter = (char) randomLetter;
            char upper = Character.toUpperCase(letter);
            str2 = "" + upper;
            
        }
        for(int i = 0; i<1; i++){
            Random randomGen = new Random();
            int num = randomGen.nextInt(10);
            int o = num;
            randomNum = "" + o;
            
        }
        for(int i = 0; i<1; i++){
            Random randomGen = new Random();
            int num = randomGen.nextInt(10);
            int o = num;
            randomNum2 = "" + o;
            
        }
        for(int i = 0; i<1; i++){
            Random randomGen = new Random();
            int num = randomGen.nextInt(10);
            int o = num;
            randomNum3 = "" + o;
            
        }
        for(int i = 0; i<1; i++){
            Random randomGen = new Random();
            int num = randomGen.nextInt(10);
            int o = num;
            randomNum4 = "" + o;
        }
        code = str + str2 + randomNum + randomNum2 + randomNum3 + randomNum4;
        System.out.println(code);
        return code;
    }
    //holoport method
    public static String[][][] holoport(String[][][] main, String[][][] container){
        int i = 0;
        int j = 0;
        int k = 0;
        if(main.length>=container.length){
            for(i = 0;i<container.length;i++){
                if(main[i].length>=container[i].length){
                    for(j = 0;j<container[i].length;j++){
                        if(main[i][j].length>=container[i][j].length){
                            for(k = 0;k<container[i][j].length;k++){
                                container[i][j][k]= main[i][j][k];
                            }
                        }
                        else{
                            for(k = 0;k<main[i][j].length;k++){
                                container[i][j][k]= main[i][j][k];
                            }
                            for(k = main[i][j].length;k<container[i][j].length;k++){
                                container[i][j][k] = "$$$$$$";
                            }
                        }
                    }
                }
                else{
                    for(j = 0;j<main[i].length;j++){
                        container[i][j] = main[i][j];
                    }
                    for(j = main[i].length;j<container[i].length;j++){
                        container[i][j]= new String[0];
                    }
                }
            }
        }
        else{
            for(i = 0;i<main.length;i++){
                container[i] = main[i];
            }
            for(i = main.length;i<container.length;i++){
                container[i]= new String[0][0];
            }  
        }
        return container;
    }
    //percentage
    public static String[][][] percentage(String[][][] mainArray, String[][][] shellArray){
        int counter = 0;
        int counter2 = 0;
        for(int i = 0; i<mainArray.length;i++){
            for(int j = 0; j<mainArray[i].length;j++){
                for(int k = 0; k<mainArray[i][j].length;k++){
                    counter++;
                }
            }
        }
        for(int i = 0; i<shellArray.length;i++){
            for(int j = 0; j<shellArray[i].length;j++){
                for(int k = 0; k<shellArray[i][j].length;k++){
                    counter2++;
                }
            }
        }
        
        double num = ((double)(counter2 - counter)/counter);
        double percent = num*100;
        System.out.print("Percentage: " + ((int)(percent*100)/100.00) + "%");
        return mainArray;
    }
    //Frankenstein method
    public static String[][][] Frankenstein(String[][][] mainArray){
        int pointer = 0;
        for(int i = 0;i<mainArray.length;i++){
            for(int j = 0; j<mainArray[i].length;j++){
                for(int k = 1; k<mainArray[i][j].length;k++){
                    pointer = k;
                    while(mainArray[i][j][pointer].compareTo(mainArray[i][j][pointer-1])<0){
                        String temp = mainArray[i][j][pointer-1];
                        mainArray[i][j][pointer-1] = mainArray[i][j][pointer];
                        mainArray[i][j][pointer] = temp;
                        pointer--;
                        if(pointer==0){
                            pointer = 0;
                        break;
                        }
                    }
                }
            }
        }
        for(int i = 0;i<mainArray.length;i++){
            for(int j = 1; j<mainArray[i].length;j++){
                pointer = j;
                    while(mainArray[i][pointer].length<mainArray[i][pointer-1].length){
                        String[] temp = mainArray[i][pointer-1];
                        mainArray[i][pointer-1] = mainArray[i][pointer];
                        mainArray[i][pointer] = temp;
                        pointer--;
                        if(pointer==0){
                        break;
                    }
                }
            }
        }
        return mainArray;
    }
    //print method bro beans
    public static String[][][] print(String[][][] printedArray){
        for(int i = 0; i<printedArray.length;i++){
            for(int j = 0; j<printedArray[i].length;j++){
                for(int k = 0; k<printedArray[i][j].length;k++){
                    System.out.print(printedArray[i][j]+", ");
                }
                System.out.print(printedArray[i]+"|");
            }
            System.out.println(printedArray+"--");
        }
        return printedArray;
    }
    public static void main(String[] args){
        String[][][] test = soRandom();
        for(int i = 0; i< test[i].length; i++){
            test[i] = soRandom();
            for(int j = 0; j < test[j][k].length; j++){
                test[i][j] = soRandom();
                for(int k = 0; k < test[i][j][k].length; k++){
                    test[i][j][k] = soRandom();
                }
            }
        } 
        
        System.out.println(test);
        //print(soRandom());
    }
}