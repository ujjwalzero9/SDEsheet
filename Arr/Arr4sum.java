package Arr;
import java.util.*;
public class Arr4sum {
   

    public static List<List<Integer>> sum(int[] arr, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 3; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < arr.length - 2; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) {
                    continue;
                }
                
                int l = j + 1;
                int k = arr.length - 1;

                while (l < k) {
                    int currentSum = arr[i] + arr[j] + arr[l] + arr[k];

                    if (currentSum == target) {
                        ArrayList<Integer> a = new ArrayList<>();
                        a.add(arr[i]);
                        a.add(arr[j]);
                        a.add(arr[l]);
                        a.add(arr[k]);
                        res.add(a);

                        // Skip duplicate elements
                        while (l < k && arr[l] == arr[l + 1]) {
                            l++;
                        }
                        while (l < k && arr[k] == arr[k - 1]) {
                            k--;
                        }

                        l++;
                        k--;
                    } else if (currentSum < target) {
                        l++;
                    } else {
                        k--;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -1, -3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<List<Integer>> res1 = sum(arr, 5);
        System.out.println(res1.toString());
        System.out.println("done");
    }
}


