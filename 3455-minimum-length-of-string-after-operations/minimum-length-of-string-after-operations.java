
/*
class Solution {
    public int minimumLength(String s) {
        int n = s.length();

        int[] freq = new int[26];
        int deleted = 0;

        for(int i = 0; i < n; i++){
            freq[s.charAt(i) - 'a']++;

            if(freq[s.charAt(i) - 'a'] == 3){
                freq[s.charAt(i) - 'a'] -= 2;
                deleted += 2;
            }
        }
        return n - deleted;
    }
}
*/

class Solution {
    public int minimumLength(String s) {
        int n = s.length();

        int[] freq = new int[26];

        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }

        int result = 0;

        for(int i = 0; i < 26; i++){
            if(freq[i] == 0) continue;

            if(freq[i] % 2 == 0){
                result += 2;
            }else{
                result += 1;
            }
        }
        return result;
    }
}