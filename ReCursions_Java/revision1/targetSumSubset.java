package revision1;

public class targetSumSubset {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        targetSum(arr, 0, "", 0, 10);
    }

    public static void targetSum(int []arr, int idx,String set,int sos,int target){
        if(idx==arr.length){
            if(sos==target){
            System.out.println(set+"");
            }return;
        }
        targetSum(arr, idx+1,  set+arr[idx]+", ", sos+arr[idx],target);
        targetSum(arr, idx+1,  set+"", sos,target);

        

    }
}
