package revision1;

public class printMazePath {
    public static void main(String[] args) {
        printMazePath1(1, 1, 3, 3, "");
        
    }

    public static void printMazePath1(int sc,int sr,int dc,int dr,String ans){
        if(sc==dc && sr==dr){
            System.out.print(ans+"");
            return;
        }
        if(sr>dr ||sc>dc){return;}
            printMazePath1(sc+1, sr, dc, dr, ans+"h");
            printMazePath1(sc, sr+1, dc, dr, ans+"v");
         
        

    }
    
}
