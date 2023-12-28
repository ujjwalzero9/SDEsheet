package Arr;
import java.util.*;
public class kadane {
    static int maxSubArraySum(int []arr){
         int sum=0;
       int max=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
        sum+=arr[i];
        if(sum>max){
            max=sum;
        }
        if(sum<0){sum=0;}
       }
       return max;
    }
    public static void main(String[] args) {
       int []arr = {-2,1,-3,4,-1,2,1,-5,4};
       int ans=maxSubArraySum(arr);
       System.out.println(ans);
      
    }
}
