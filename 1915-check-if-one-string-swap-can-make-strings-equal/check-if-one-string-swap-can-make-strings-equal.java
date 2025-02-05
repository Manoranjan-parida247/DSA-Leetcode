/*
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;

        int n = s1.length();
        int diffCount  = 0;
        int firstIdx = 0;
        int secondIdx = 0;

        for(int i = 0; i < n; i++){
            if(s1.charAt(i) != s2.charAt(i)){
                diffCount++;

                if(diffCount > 2){
                    return false;
                }else if(diffCount == 1){
                    firstIdx = i;
                }else{
                    secondIdx = i;
                }
            }
        }
        return ((s1.charAt(firstIdx) == s2.charAt(secondIdx)) && s1.charAt(secondIdx) == s2.charAt(firstIdx));
    }
}
*/

// Brute force

// /T.C : O(n)
//S.C : O(26) ~= O(1)
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int n = s1.length();

        if (s1.equals(s2)) {
            return true;
        }

        int diffs = 0;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diffs++;
            }

            if (diffs > 2)
                return false;

            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }
}