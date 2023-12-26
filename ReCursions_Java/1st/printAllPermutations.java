public class printAllPermutations {

public static void main(String[] args) {
    printAllPerm("abc","");
}
public static void printAllPerm(String str,String ans){
   if(str.length()==0){
    System.out.println(ans);
    return;
   }
    for(int i=0;i<str.length();i++){
        char c=str.charAt(i);
        String sub=str.substring(0,i)+str.substring(i+1);
        printAllPerm(sub, ans+c);
    }
}
    
}
