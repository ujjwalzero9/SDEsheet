import java.util.*;

public class mazeJumpPath {
    public static void main(String[] args) {
        int m=3;
        int n=3;
        List<String>ans=allpath(1, 1, m, n);
        System.out.println(ans);
    }
 public static List<String> allpath(int sr,int sc,int dr,int dc){
    if(sr==dr && sc==dc){
        List<String>bres=new ArrayList<>();
        bres.add("");
        return bres;
    }
    List<String>paths=new ArrayList<>();

  
    for(int i=1;i<=dr-sr;i++){
        List<String>hpath=allpath(sr+1, sc, dr, dc);
        for(String str:hpath){
            paths.add("h"+i+str);
        }
    }

 
    for(int i=1;i<=dc-sc;i++){
        List<String>vpath=allpath(sr, sc+1, dr, dc);
        for(String str:vpath){
            paths.add("v"+i+str);
        }
    }

       
        for(int i=1;i<=dc-sc && i<=dr-sr;i++){
        List<String>dpath=allpath(sr+1, sc+1, dr, dc);
        for(String str:dpath){
            paths.add("d"+i+str);
        }
    }

return paths;
  
 }
    
}
