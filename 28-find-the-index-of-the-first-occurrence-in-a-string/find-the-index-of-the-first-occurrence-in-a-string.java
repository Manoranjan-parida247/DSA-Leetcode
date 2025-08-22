class Solution {
    public int strStr(String haystack, String needle) {
        // Edge case: empty needle should return 0
        if (needle.isEmpty()) return 0;

        // Loop only until remaining characters >= needle length
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;
            // Check if substring starting at i matches needle
            while (j < needle.length() && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            // If we matched all characters of needle, return the starting index
            if (j == needle.length()) {
                return i;
            }
        }

        // If not found, return -1
        return -1;
    }
}
