package revision1;

public class KnightTours {
   public static void main(String[] args) {
    int [][] chess=new int[5][5];
    printknightstour(chess, 2, 3, 0);
   } 
   public static void printknightstour(int[][] chess,int sr,int sc,int move){
    if(sr<0 || sc<0 || sr>=chess.length || sc>=chess.length ||chess[sr][sc]>0){
        return;
    }
   else if(move == chess.length*chess.length){
        chess[sr][sc]=move;
        displayBoard(chess);
        chess[sr][sc]=0;
        return;
    }
    chess[sr][sc]=move;
   
    printknightstour(chess, sr-2, sc+1, move+1);
    printknightstour(chess, sr-1, sc+2, move+1);
    printknightstour(chess, sr+1, sc+2, move+1);
    printknightstour(chess, sr+2, sc+1, move+1);
    printknightstour(chess, sr+2, sc-1, move+1);
    printknightstour(chess, sr+1, sc-2, move+1);
    printknightstour(chess, sr-1, sc-2, move+1);  
    printknightstour(chess, sr-2, sc-1, move+1);
    chess[sr][sc] = 0;
   }
   public static void displayBoard(int[][]chess){
    for(int i=0;i<chess.length;i++){
        for(int j=0;j<chess[0].length;j++){
            System.out.print(chess[i][j]+" ");
    }
    System.out.println();
   }
   System.out.println();
   }
}
