package revision1;
import java.util.*;
public class getMazePath {
    public static void main(String[] args) {
        List<String> res=getMazePath1(1, 1, 3, 3);
        System.out.println(res);
    }
    public static List<String> getMazePath1(int sr ,int sc, int dr, int dc){
        if(sc==dc && sr==dr){
            List<String>bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        if(sc>dc || sr>dr){
            List<String>bres=new ArrayList<>();
           
            return bres;
        }
        List<String> hpath=getMazePath1(sr, sc+1, dr, dc);
        List<String> vpath=getMazePath1(sr+1, sc, dr, dc);
        List<String>paths=new ArrayList<>();
        for(String str:hpath){
            paths.add(str+"h");
        }
         for(String str:vpath){
            paths.add(str+"v");
        }
        return paths;
    }
    
}
