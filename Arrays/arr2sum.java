import java.util.*;

/**
 * arr2sum
 */
public class arr2sum {

public static List<List<Integer>> sum(int []arr,int target){
    List<List<Integer>> res =new ArrayList<>();
    int high=arr.length-1;
    int low=0;
    Arrays.sort(arr);
    while(low<high){
        if(low>0 && arr[low]==arr[low-1]){continue;}
        if(arr[low]+arr[high]==target){ 
            ArrayList<Integer> a=new ArrayList<>();
            a.add(arr[low]);
            a.add(arr[high]);
            res.add(a);

        }
        if(arr[low]+arr[high]<target){
            low++; 
         }
         else{
            high--;
         }
        }
return res;
    
}
public static void main(String[] args) {
   int[] arr={-2,-1,-3,1,2,3,4,5,6,7,8,9,10};
    List<List<Integer>> res1=sum(arr,5 );
    System.out.println(res1.toString());
}
    
}