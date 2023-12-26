import java.util.*;
public class allSubSeq {
    public static void main(String[] args) {
        String str="abc";
        List<String> ans1=allSubSequence(str);
        System.out.println(ans1);
        
    }
    public static List<String> allSubSequence(String str){
        if(str.length()==0){
           List<String>bres=new ArrayList<>();
           bres.add("");
           return bres;
        }
        char ch=str.charAt(0);
        String sub=str.substring(1);
        
        List<String>ans=allSubSequence(sub);
        List<String>mans=new ArrayList<>();
        for(String rstr:ans){
            mans.add(rstr);
            mans.add(ch+rstr);

        }
        return mans;
    }
    
}
