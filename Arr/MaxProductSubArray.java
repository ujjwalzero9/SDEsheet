package Arr;

public class MaxProductSubArray {
    public static int MaxProduct(int[]arr){
     
        int pre=1;
        int suff=1;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            pre=pre*arr[i];
            suff=suff*arr[arr.length-1-i];
            ans=Math.max(ans,Math.max(pre, suff));
            if(pre==0){pre=1;}
            if(suff==0){suff=1;}
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]arr = {6, -3, -10, 0, 2};
        int ans=MaxProduct(arr);
        System.out.println(ans);
    }
}
