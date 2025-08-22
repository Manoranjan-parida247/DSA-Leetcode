class Solution {
    public boolean isPalindrome(String s) {
        // Convert to lowercase
        s = s.toLowerCase();

        // Build filtered string (only letters and digits)
        StringBuilder filtered = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                filtered.append(ch);
            }
        }

        // Two-pointer check
        int left = 0;
        int right = filtered.length() - 1;
        while (left < right) {
            if (filtered.charAt(left) != filtered.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
