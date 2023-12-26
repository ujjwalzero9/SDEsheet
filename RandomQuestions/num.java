class Solution {
    public static int numberOfSubstrings(String s) {
        int count = 0;
        int len = s.length();
        int temp = 0;
        
        String arr[] = new String[len * (len + 1) / 2];

        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                arr[temp] = s.substring(i, j + 1);
                if (ContainsABC(arr[temp])) {
                    count++;
                }
                temp++;
            }
        }
        return count;
    }

    public static boolean ContainsABC(String str) {
        
        if (str.contains("a") && str.contains("b") && str.contains("c")) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        String str="abcabc";
        String str1="aaacb";
        int ans1=numberOfSubstrings(str);
         int ans2=numberOfSubstrings(str1);
         System.out.println("there are "+ans1+" number of substring that contain abc in"+str);
         System.out.println("there are "+ans2+" number of substring that contain abc in"+str1);
    }
}
