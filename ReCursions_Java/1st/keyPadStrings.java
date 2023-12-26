import java.util.ArrayList;
import java.util.List;

public class keyPadStrings {

    static String[] codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vx","yz",""};
    public static void main(String[] args) {
        String str="573";
        List<String>res=allSeq(str);
        System.out.println(res);
    }

public static List<String> allSeq(String str){
    if(str.length()==0){
        List<String>bres=new ArrayList<>();
        bres.add("");
        return bres;
    }
    char ch=str.charAt(0);
    String sub=str.substring(1);
    List<String>ans=allSeq(sub);
    List<String>mans=new ArrayList<>();
    String codeforce=codes[ch-'0'];
    for(int i=0;i<codeforce.length();i++){
        char c=codeforce.charAt(i);
        for(String rstr:ans){
            mans.add(c+rstr);
        }
    }
    return mans;
}

























}


