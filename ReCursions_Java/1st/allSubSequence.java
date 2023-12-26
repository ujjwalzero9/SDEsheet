import java.util.*;
public class allSubSequence {
public static void main(String[] args) {
   List<String> res=allSubsequence("xyz");
   System.out.println(res); 
}

public static List<String> allSubsequence(String str){
    if(str.length()==0){
        List<String> bres=new ArrayList<>();
        bres.add("");
        return bres;
    }
    //a bc
    char ch=str.charAt(0);
    String sub=str.substring(1);
    List<String> ans=allSubsequence(sub);
    List<String> mans=new ArrayList<>();
    for(String rstr:ans){
        mans.add(rstr+ch);
        mans.add(rstr+"");
    }
    return mans;
    }
    }
