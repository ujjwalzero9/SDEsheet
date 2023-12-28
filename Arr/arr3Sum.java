package Arr;
import java.util.*;


public class arr3Sum {

    public static List<List<Integer>> sum(int[] arr, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = arr.length - 1;

            while (j < k) {
                int currentSum = arr[i] + arr[j] + arr[k];

                if (currentSum == target) {
                    ArrayList<Integer> a = new ArrayList<>();
                    a.add(arr[i]);
                    a.add(arr[j]);
                    a.add(arr[k]);
                    res.add(a);

                    j++;
                    k--;

                    // Skip duplicate elements
                    while (j < k && arr[j] == arr[j - 1]) {
                        j++;
                    }
                    while (j < k && arr[k] == arr[k + 1]) {
                        k--;
                    }
                } else if (currentSum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -1, -3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<List<Integer>> res1 = sum(arr, 5);
        System.out.println(res1.toString());
    }
}
