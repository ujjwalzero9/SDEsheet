public class printMazePath {
    public static void main(String[] args) {
        printAll(1, 1, 3, 3, "");
    }
    public static void printAll(int sr,int sc,int dr,int dc,String ans){
        if(sr==dr && sc==dc){
            System.out.println(ans);
            return;
        }
        if(sr>dr ||sc>dc){return;}
        printAll(sr+1,sc,dr,dc,ans+"h");
        printAll(sr,sc+1,dr,dc,ans+"v");


    }
}
