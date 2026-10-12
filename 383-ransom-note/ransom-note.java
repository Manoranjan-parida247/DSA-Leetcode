class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()){
            return false;
        }
        int[] freqRansomNote = new int[26];
        int[] freqMagazine = new int[26];

        for(char ch: ransomNote.toCharArray()){
            freqRansomNote[ch - 'a']++;
        }
        for(char ch: magazine.toCharArray()){
            freqMagazine[ch - 'a']++;
        }

        for(int i = 0; i < 26; i++){
            if(freqRansomNote[i] > freqMagazine[i]) return false;
        }

        return true;
    }
}