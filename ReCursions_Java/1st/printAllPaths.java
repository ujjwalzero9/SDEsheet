class printAllPaths{
public static void main(String[] args) {
    printAllPathN(4, "");

}

public static void printAllPathN(int n,String ans){
if(n==0){
    System.out.println(ans);
    return;
}
if(n<0){
    return;
}
printAllPathN(n-1, ans+"1");
printAllPathN(n-2, ans+"2");
printAllPathN(n-3, ans+"3");

}




}