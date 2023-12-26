package revision1;
import java.util.*;
public class getAllSubSeq {
    public static void main(String[] args) {
        //input abc
        //output -[, a, b, ab, c, ac, bc, abc]
        List<String>res=getSeq("abc");
        Collections.sort(res);
        System.out.println(res);
    }
    public static List<String> getSeq(String str){
    if(str.length()==0){
    List<String> bres=new ArrayList<>();
    bres.add("");
    return bres;
    }
    char ch=str.charAt(0);
    String sub=str.substring(1);
    List<String>ans=getSeq(sub);
    List<String>mans=new ArrayList<>();
    for(String rstr:ans){
        mans.add(ch+rstr);
        mans.add(""+rstr);

    }
    
    return mans;

    }
    
}
