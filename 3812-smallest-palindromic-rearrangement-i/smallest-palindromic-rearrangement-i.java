class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int mid = n / 2;
        char[] strs = s.toCharArray();

        Arrays.sort(strs, 0, mid);

        for(int i = 0; i < mid; i++){
            strs[n-1-i] = strs[i];
        }

        return new String(strs);
    }
}