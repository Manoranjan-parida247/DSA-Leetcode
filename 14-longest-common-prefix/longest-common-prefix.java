class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Edge case: if the array is empty or the first string is empty
        if (strs.length == 0 || strs[0].length() == 0) {
            return "";
        }

        // Use StringBuilder for efficient string concatenation
        StringBuilder ans = new StringBuilder();

        // Loop through each character of the first string
        for (int i = 0; i < strs[0].length(); i++) {
            // Get the current character from the first string
            char currentChar = strs[0].charAt(i);

            // Compare this character with the same position in all other strings
            for (int j = 1; j < strs.length; j++) {
                // If:
                // 1. Current index exceeds the length of any string, OR
                // 2. The character at this index doesn't match
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {
                    // Return the prefix found so far
                    return ans.toString();
                }
            }

            // If all strings had the same character at this position, add it to the answer
            ans.append(currentChar);
        }

        // Return the final longest common prefix
        return ans.toString();
    }
}
