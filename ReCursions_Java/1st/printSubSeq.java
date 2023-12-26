class printSubSeq{
public static void main(String[] args) {
    printAllSeq("abc", "");
}

public static void printAllSeq(String str,String ans){
    if(str.length()==0){
        System.out.println(ans);
        return;
    }
    char ch=str.charAt(0);
    String sub=str.substring(1);
    printAllSeq(sub, ans+ch);
     printAllSeq(sub, ans+"");
}


}