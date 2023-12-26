package revision1;

import java.util.ArrayList;
import java.util.List;

public class getStairPath {
    public static void main(String[] args) {
               List<String> res=getStairPath1(5);
               System.out.println(res);

    }
    public static List<String> getStairPath1(int n){
       if(n==0){
        List<String> bres=new ArrayList<>();
        bres.add("");
        return bres;
       }
       if(n<0){
         List<String> bres=new ArrayList<>();
        return bres;
       }
       List<String>path1=getStairPath1(n-1);
       List<String>path2=getStairPath1(n-2);
       List<String>path3=getStairPath1(n-3);
       List<String> paths=new ArrayList<>();
       for(String str:path1){
        paths.add(str+"1");
       }
       for(String str:path2){
        paths.add(str+"2");
       }
       for(String str:path3){
        paths.add(str+"3");
       }
       return paths;
    }
}
