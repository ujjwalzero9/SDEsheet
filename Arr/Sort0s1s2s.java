package Arr;
import java.util.*;

public class Sort0s1s2s {
    public static void sort(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (mid <= high) {
            if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {2,2,1, 2, 1, 2, 0, 0,1,1,2,2};
        sort(a);
        System.out.println(Arrays.toString(a));
      //  System.out.println("hello");
    }
}
