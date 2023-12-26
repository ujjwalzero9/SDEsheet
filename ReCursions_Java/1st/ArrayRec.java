import java.util.*;
public class ArrayRec {
    public static void main(String[] args) {
       
        int []arr={1,2,3,4,5,3,6,7,8,9,3};
        int a=firstIndex(arr, 0, 3);
        int b=lastIndex(arr, 0, 3);
      int [] c=AllIndex(arr, 0,3,0);
        System.out.println(a);
         System.out.println(b);
          System.out.println(Arrays.toString(c));
    }



    public static int firstIndex(int[] arr,int idx, int d ){
        if(idx==arr.length){return -1; }
        if(arr[idx]==d){return idx;}
        else{
            int fisf=firstIndex(arr, idx+1, d);
            return fisf;
            }
        }

        public static int lastIndex(int[] arr, int idx, int d) {
         if (idx == arr.length) {return -1;}
        int lisf = lastIndex(arr, idx + 1, d);
        if (lisf== -1) {
            if(arr[idx]==d){return idx;}
            else{return -1; }}
        else{    return lisf;}
        }
        

public static int[] AllIndex(int[] arr,int idx, int d ,int fsf){
    if(idx==arr.length){
        return new int[fsf];
        
    }
    if(arr[idx]==d){
       int[] ans= AllIndex(arr, idx+1, d, fsf+1);
        ans[fsf]=idx;
        return ans;
    }
    else{
       int[]ans= AllIndex(arr, idx+1, d, fsf);
       return ans;
    }
    
}
    
}