//  javac MineSweeper.java//
//run the program
//  java MineSweeper//
import java.util.Scanner;
public class ex{
    private static char[][] arrayN;
    private static int M;
    private static int N;
    public static void main(String[] args){
        setUp();
        System.out.print(view());
    }
    public static void setUp(){
    Scanner myScanner = new Scanner( System.in );
  System.out.println("Please enter size of board: ");
  N = myScanner.nextInt();
  arrayN = new char[N][N];
  System.out.println("Enter amount of mines (between 1 and " + N*N + ")");
  M = myScanner.nextInt();
  place(M);
  Nonplace();
    }
    public static String view(){
    String Board = "";
    for(int row = 0; row < N; row++){
        String seeRow = "";
        for(int column = 0; column < N; column++){
            seeRow += "[" + arrayN[row][column] + "]";
        }
        Board += seeRow + "\n";
    }
    return Board;
}
    
  public static void place(int number){
      int Mplaced = 0;
      while(Mplaced < number){
          int mRow = (int)(Math.random()*N);
          int mColumn = (int)(Math.random()*N);
          if(arrayN[mRow][mColumn] == 0){
              arrayN[mRow][mColumn] = 'M';
              Mplaced++;
          }
      }
      
  }
  
  public static void Nonplace(){
    for(int row = 0; row < N; row++){
        for(int column = 0; column < N; column++){
            if (arrayN[row][column] == 0){
                int numAdj = adjacentCells(row,column);
                arrayN[row][column] = (char)(numAdj + 48);
            }
        }
    }
}
public static int adjacentCells(int A, int B){
    int adjM = 0;
    int row = A - 1;
    for(int i = 0; i < 3; i++){
        int column = B - 1;
        for(int j = 0; j < 3; j++){
        if((row >= 0 && row < N) && (column >= 0 && column < N)){
            if(arrayN[row][column] == 'M'){
                adjM++;
            }
        }column++;
    }row++;
}
return adjM;
}

}