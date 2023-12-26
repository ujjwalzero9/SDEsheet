
package revision1;


public class printAllSubSeq {
    public static void main(String[] args) {
         //input abc
        //output -[, a, b, ab, c, ac, bc, abc]
printAllSubSeq1("abc", "");


    }
    public static void printAllSubSeq1(String str, String ans){
        if (str.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=str.charAt(0);
        String sub=str.substring(1);
        printAllSubSeq1(sub, ans+ch);
        printAllSubSeq1(sub, ans+"");


    }
}
