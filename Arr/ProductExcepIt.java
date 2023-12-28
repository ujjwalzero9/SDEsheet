package Arr;
import java.util.*;


public class ProductExcepIt {
    public static int [] ProductExcepItSelf(int []arr, int n){
        int[]ans=new int[n];
        int pdt=1;
        int countZeros=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){countZeros++;}
            else{pdt*=arr[i];}
        }
        if(countZeros>1){Arrays.fill(ans,0);}
        if(countZeros==1){
            for(int i=0;i<n;i++){
                if(arr[i]==0){
                    ans[i]=pdt;
                }
                else{ans[i]=0;}
            }
        }
        else{
            for(int i=0;i<n;i++){
                ans[i]=pdt/arr[i];
            }

        }
    
        return ans;
    }
    public static void main(String[] args) {
        int arr[]  = {10, 3, 5, 6, 2};
        int []ans=ProductExcepItSelf(arr, arr.length);
      
        System.out.println(Arrays.toString(ans));
      
    }
}
