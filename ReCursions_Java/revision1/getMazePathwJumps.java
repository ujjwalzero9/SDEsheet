package revision1;

import java.util.*;

public class getMazePathwJumps {
    public static void main(String[] args) {
        List<String> res=getAllMazePathwJ(1, 1, 3, 3);
        System.out.println(res);
    }
    public static List<String> getAllMazePathwJ(int sr,int sc,int dr,int dc){
        if(sr==dr && sc==dc){
           List<String> bres=new ArrayList<>();
           bres.add("");
           return bres;
        }
        // if(sr>dr || sc>dc){
        // List<String> bres=new ArrayList<>();
        // return bres;
        // }
         List<String> paths=new ArrayList<>();
        for(int i=1;i<=dc-sc;i++){
        List<String> hpath=getAllMazePathwJ(sr, sc+1, dr, dc);
        for(String str:hpath){
        paths.add("h"+i+str);
        }}

        for(int i=1;i<=dr-sr;i++){
        List<String> vpath=getAllMazePathwJ(sr+1, sc, dr, dc);
        for(String str:vpath){
        paths.add("v"+i+str);
        }}
        for(int i=1;i<=dc-sc && i<=dr-sr;i++){
            List<String>dpath=getAllMazePathwJ(sr+1, sc+1, dr, dc);
            for(String str:dpath){
                paths.add("d"+i+str);
            }
        }
return paths;
       
       
    }
}
