class Solution {
    public static int numberOfSubstrings(String s) {
        int count = 0;
        int start = 0;
        int k = 2;

        while (k < s.length()) {
            String temp = s.substring(start, k + 1);

            if (temp.contains("a") && temp.contains("b") && temp.contains("c")) {
                count += s.length() - k;
                start++;
            } else {
                k++;
            }
        }

        return count;
    }
        public static void main(String[] args) {
        String str="abcabc";
        String str1="aaacb";
        String str2="aabbcc";
        int ans1=numberOfSubstrings(str);
         int ans2=numberOfSubstrings(str1);
         System.out.println("there are "+ans1+" number of substring that contain abc in"+str);
         System.out.println("there are "+ans2+" number of substring that contain abc in"+str1);
    }


}
 String str="abcabc";
