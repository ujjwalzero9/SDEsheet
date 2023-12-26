package revision1;

public class printKeypad {
    static String[] codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vx","yz",""};
    public static void main(String[] args) {
        printKeypad2("573", "");
        
    }
public static void printKeypad2(String str,String ans){
    if(str.length()==0){
        System.out.print(ans+", ");
        return;
    }
    char ch=str.charAt(0);
    String sub=str.substring( 1);
    String codeforces=codes[ch-'0'];
    for(int i=0;i<codeforces.length();i++){
        char c=codeforces.charAt(i);
        printKeypad2(sub, ans+c);
    }




}
}
