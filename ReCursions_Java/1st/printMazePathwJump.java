public class printMazePathwJump {

  
        public static void main(String[] args) {
            printAll2(1, 1, 3, 3, "");
        }
        public static void printAll2(int sr,int sc,int dr,int dc,String ans){
            if(sr==dr && sc==dc){
                System.out.println(ans);
                return;
            }
            //if(sr>dr ||sc>dc){return;}
           for(int i=1;i<=dc-sc;i++){
            printAll2(sr, sc+1, dr, dc, ans+"h"+i);
           }
            for(int i=1;i<=dr-sr;i++){
            printAll2(sr+1, sc, dr, dc, ans+"v"+i);
           }
    
        }
    
    
    
}
