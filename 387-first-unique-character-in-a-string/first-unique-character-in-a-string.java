/*
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> fMap = new HashMap<>();

        for(char ch: s.toCharArray()){
            fMap.put(ch, fMap.getOrDefault(ch, 0)+1);
        }

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(fMap.get(ch) == 1){
                return i;
            }
        }
        return -1;
    }
}
*/
class Solution {
    public int firstUniqChar(String s) {
         // Array to store the frequency of each character
        int[] charCount = new int[26];

        // Populate the frequency array
        for (char ch : s.toCharArray()) {
            charCount[ch - 'a']++; // Map 'a' to 0, 'b' to 1, ..., 'z' to 25
        }

        // Find the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (charCount[s.charAt(i) - 'a'] == 1) {
                return i; // Return the index of the first unique character
            }
        }

        return -1; // No non-repeating character found
    }
}