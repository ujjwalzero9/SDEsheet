package revision1;

public class printMazePathwJ {
    public static void main(String[] args) {
      printMazePathwJ1(1, 1, 3, 3, "");  
    }
    public static void printMazePathwJ1(int sr,int sc,int dr,int dc,String ans){
        if(sc==dc && sr==dr){
            System.out.print(ans+", ");
            return;
        }
        //if(sc>dc || sr>dr){ return;}
        for(int i=1;i<=dc-sc;i++){
        printMazePathwJ1(sr, sc+i, dr, dc,ans+"h"+i);}
     for(int i=1;i<=dr-sr;i++){
        printMazePathwJ1(sr+i, sc, dr, dc, ans+"v"+i);}
        for(int i=1;i<=dc-sc;i++){
        printMazePathwJ1(sr+i, sc+i, dr, dc,ans+"d"+i);}
    }
    
}
