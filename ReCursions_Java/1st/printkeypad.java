
public class printkeypad {
    public static void main(String[] args) {
        String str="573";
        printAllKeypad(str, "");
        
    }
    static String[] codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vx","yz",""};

    public static void printAllKeypad(String str,String ans){
        if(str.length()==0){
            System.out.print(ans+", ");
            return;
        }
        char ch=str.charAt(0);
        String sub=str.substring(1);
         
        String codeforce=codes[ch-'0'];
        for(int i=0;i<codeforce.length();i++){
            char ch1=codeforce.charAt(i);
            printAllKeypad(sub, ans+ch1);
        }
    }
    
}
