package Arr;

public class StockBuySell {
    public static int maxProfit(int[]arr){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min,arr[i]);
            max=Math.max(max,arr[i]-min);
        }
        return max;
    }
    public static void main(String[] args) {
        int [] prices={7,1,5,3,6,4};
        int ans=maxProfit(prices);
        System.out.println(ans);
    }
}
