class Solution {
    public String largestOddNumber(String num) {
        int oddNumIdx = -1;

        // find the last odd digit from right
        for (int i = num.length() - 1; i >= 0; i--) {
            int digit = num.charAt(i) - '0'; // convert char to int
            if (digit % 2 != 0) {
                oddNumIdx = i;
                break;
            }
        }

        if (oddNumIdx == -1) {
            return ""; // no odd digit found
        }

        // return substring from start to oddNumIdx (inclusive)
        return num.substring(0, oddNumIdx + 1);
    }
}
