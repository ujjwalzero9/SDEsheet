package revision1;

public class printPermutations {
    public static void main(String[] args) {
        printPermutations1("abc", "");
    }
    public static void printPermutations1(String str,String ans ){
        if(str.length()==0){
            System.out.print(ans+", ");
            return;
        }

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String subString=str.substring(0, i)+str.substring(i+1);
            printPermutations1(subString, ans+ch);
        }


    }
}
