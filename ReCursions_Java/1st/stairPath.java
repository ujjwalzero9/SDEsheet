import java.util.*;
public class stairPath {
    
    public static void main(String[] args) {
        List<String> res=allPaths(10);
        System.out.println(res);
        
    }
public static List<String> allPaths(int n){
    if(n==0){
        List<String>bres=new ArrayList<>();
        bres.add("");
        return bres;
    }
    if(n<0){
         List<String>bres=new ArrayList<>();
        
        return bres;
    }

    List<String> path1=allPaths(n-1);
    List<String> path2=allPaths(n-2);
    List<String> path3=allPaths(n-3);
    List<String> paths=new ArrayList<>();

    for(String path:path1){
        paths.add("1"+path);
    }
    for(String path:path2){
        paths.add("2"+path);
    }
     for(String path:path3){
        paths.add("3"+path);
    }
    return paths;



}

}
