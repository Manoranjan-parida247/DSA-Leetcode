class Solution {
    public int balancedStringSplit(String s) {
        int lCount = 0;
        int rCount = 0;
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'L') {
                lCount++;
            } else {
                rCount++;
            }

            if (lCount == rCount) {
                ans++;
                lCount = 0;
                rCount = 0;
            }
        }

        return ans;
    }
}
