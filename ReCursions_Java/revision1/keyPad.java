package revision1;
import java.util.*;
public class keyPad {
    static String[] codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vx","yz",""};
   public static void main(String[] args) {
    List<String> res=keyPad1("573");
    System.out.println(res);
   }
   public static List<String> keyPad1(String str){
    if(str.length()==0){
        List<String> bres=new ArrayList<>();
        bres.add("");
        return bres;
    }
    char ch=str.charAt(0);
    String subString=str.substring(1);
    String codeforces=codes[ch-'0'];
    List<String>ans=keyPad1(subString);
    List<String>mans=new ArrayList<>();
    for(int i=0;i<codeforces.length();i++){
        char c=codeforces.charAt(i);
        for(String rstr:ans){
            mans.add(c+rstr);
        }
    }
    return mans;
   } 
}
