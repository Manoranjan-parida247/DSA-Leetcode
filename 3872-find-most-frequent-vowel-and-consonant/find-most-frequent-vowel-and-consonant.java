class Solution {
    public int maxFreqSum(String s) {
        int n = s.length();
        int[] freqArr = new int[26];

        // Count frequency of each character
        for (int i = 0; i < n; i++) {
            int charIndex = s.charAt(i) - 'a';
            freqArr[charIndex]++;
        }

        // Define vowels
        String vowels = "aeiou";
        int vowelMax = Integer.MIN_VALUE;
        int consonantMax = Integer.MIN_VALUE;

        // Find max frequency among vowels and consonants
        for (int i = 0; i < 26; i++) {
            char ch = (char) (i + 'a');
            if (vowels.indexOf(ch) != -1) { // it's a vowel
                vowelMax = Math.max(vowelMax, freqArr[i]);
            } else { // it's a consonant
                consonantMax = Math.max(consonantMax, freqArr[i]);
            }
        }

        return vowelMax + consonantMax;
    }
}
