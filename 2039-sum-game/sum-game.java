class Solution {
    public boolean sumGame(String num) {
        int n = num.length();

        int sum1 = 0;
        int sum2 = 0;

        int cnt1 = 0;
        int cnt2 = 0;

        // First half
        for (int i = 0; i < n / 2; i++) {
            char ch = num.charAt(i);

            if (ch == '?') {
                cnt1++;
            } else {
                sum1 += ch - '0';
            }
        }

        // Second half
        for (int i = n / 2; i < n; i++) {
            char ch = num.charAt(i);

            if (ch == '?') {
                cnt2++;
            } else {
                sum2 += ch - '0';
            }
        }

        // Odd number of '?' -> Alice gets the advantage
        if ((cnt1 + cnt2) % 2 == 1) {
            return true;
        }

        // Bob wins only in this exact balancing case
        return sum1 - sum2 != 9 * (cnt2 - cnt1) / 2;
    }
}