import java.util.*;
public class mazePath {
    public static void main(String[] args) {
        int m=3;
        int n=3;
        List<String>ans=getAllMazePath(1, 1, m, n);
        System.out.println(ans);
        
    }
  
    
public static List<String> getAllMazePath(int sr,int sc ,int dr, int dc){
if(sr==dr && sc==dc){
    List<String>bres=new ArrayList<>();
    bres.add("");
    return bres;
}

List<String>hpath=new ArrayList<>();
List<String>vpath=new ArrayList<>();;
if(sc<dc){
    hpath=getAllMazePath(sr, sc+1, dr, dc);
}
if(sr<dr){
    vpath=getAllMazePath(sr+1, sc, dr, dc);
}

List<String>paths=new ArrayList<>();

for(String str:hpath){
    paths.add("h"+str);
}
for(String str:vpath){
    paths.add("v"+str);
}
return paths;

}
}
