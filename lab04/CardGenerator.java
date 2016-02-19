//Kobe Miller
//2-19-16
//Card Generator will randomly select a card
//Program will randomly select a number 1-4
//1-4 correlate to each suit of the deck
//once a suit is selected, then it picks a random number 1-14
//finally it prints out what ever random card the program picked

public class CardGenerator {
       public static void main(String[] args) {
           int suitGen = (int)((Math.random()*3)+1); //to prevent the random number gen from selecting 0
           if (suitGen==1){ //if the suit gen is one, it will go through these commands
               int randomCard1 = (int)((Math.random()*13)+1); //this picks a random number (0-13)+1
               if (randomCard1==1) //if it generates a 1, it forces it to input a 2
               {
                   System.out.println("You got the 2 of diamonds");
               }
                if ( randomCard1<=9 && randomCard1>=2)
                {
                    System.out.println("You got the "+randomCard1+" of diamonds");
                }
                else if ( randomCard1==11 )
                {
                    System.out.println("You got the jack of diamonds");
                }
                else if ( randomCard1==12 )
                {
                    System.out.println("You got the queen of diamonds");
                }
                else if ( randomCard1==13 )
                {
                    System.out.println("You got the king of diamonds");
                }
                
                else
                {
                    System.out.println("You got the ace of diamonds");
                }
            
           }
            if (suitGen==2){
               int randomCard2 = (int)((Math.random()*13)+1);
               if (randomCard2==1)
               {
                   System.out.println("You got the 2 of clubs");
               }
                if ( randomCard2<=9 && randomCard2>=2)
                {
                    System.out.println("You got the "+randomCard2+" of clubs");
                }
                else if ( randomCard2==11 )
                {
                    System.out.println("You got the jack of clubs");
                }
                else if ( randomCard2==12 )
                {
                    System.out.println("You got the queen of clubs");
                }
                else if ( randomCard2==13 )
                {
                    System.out.println("You got the king of clubs");
                }
                
                else 
                {
                    System.out.println("You got the ace of clubs");
                }
            
            }
            if (suitGen==3){
               int randomCard3 = (int)((Math.random()*13)+1);
               if (randomCard3==1 )
               {
                   System.out.println("You got the 2 of hearts");
               }
                if ( randomCard3<=9 && randomCard3>=2)
                {
                    System.out.println("You got the "+randomCard3+" of hearts");
                }
                else if ( randomCard3==11 )
                {
                    System.out.println("You got the jack of hearts");
                }
                else if ( randomCard3==12 )
                {
                    System.out.println("You got the queen of hearts");
                }
                else if ( randomCard3==13 )
                {
                    System.out.println("You got the king of hearts");
                }
                
                else 
                {
                    System.out.println("You got the ace of hearts");
                }
            
           }
           if (suitGen==4){
               int randomCard4 = (int)((Math.random()*13)+1);
               if (randomCard4==1)
               {
                   System.out.println("You got the 2 of spades");
               }
                if ( randomCard4<=9 && randomCard4>=2)
                {
                    System.out.println("You got the "+randomCard4+" of spades");
                }
                else if ( randomCard4==11 )
                {
                    System.out.println("You got the jack of spades");
                }
                else if ( randomCard4==12 )
                {
                    System.out.println("You got the queen of spades");
                }
                else if ( randomCard4==13 )
                {
                    System.out.println("You got the king of spades");
                }
                
                else if ( randomCard4==14 )
                {
                    System.out.println("You got the ace of spades");
                }
            
           }
           
    }  //end of main method   
} //end of class