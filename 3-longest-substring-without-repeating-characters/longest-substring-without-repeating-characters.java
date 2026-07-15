class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int ans = 0;

        for(int right = 0; right < n; right++){
            char ch = s.charAt(right);

            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(ch);

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}