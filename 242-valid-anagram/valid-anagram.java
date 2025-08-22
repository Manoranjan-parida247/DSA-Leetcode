//T.C -> O(NlogN)
//S.C -> O(1)
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        {
            return false;
        }
        
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        if(Arrays.equals(s1,s2))
        {
            return true;
        }
        return false;
        


    }
}

//What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

//T.C -> O(N)
//S.C -> O(N)
import java.util.HashMap;

public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> countMap = new HashMap<>();

        // Count characters in string s
        for (char ch : s.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }

        // Decrease count for characters in string t
        for (char ch : t.toCharArray()) {
            if (!countMap.containsKey(ch)) {
                return false;
            }
            countMap.put(ch, countMap.get(ch) - 1);
            if (countMap.get(ch) == 0) {
                countMap.remove(ch);
            }
        }

        // Check if all counts are zero
        return countMap.isEmpty();
    }
}



public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        {
            return false;
        }
        int[] count = new int[26];
        for(char ch : s.toCharArray())
        {
            count[ch - 'a']++;
        }

        for(char ch : t.toCharArray())
        {
            count[ch - 'a']--;
        }

        // Check if all elements in the array are 0
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }
}

//if string contains all ASCII characters

public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[128];

        for (char ch : s.toCharArray()) {
            count[ch]++;
        }

        for (char ch : t.toCharArray()) {
            count[ch]--;
        }

        // Check if all elements in the array are 0
        for (int i = 0; i < 128; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }
}



public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[52];

        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                count[ch - 'a']++;
            } else if (ch >= 'A' && ch <= 'Z') {
                count[ch - 'A' + 26]++;
            }
        }

        for (char ch : t.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                count[ch - 'a']--;
            } else if (ch >= 'A' && ch <= 'Z') {
                count[ch - 'A' + 26]--;
            }
        }

        // Check if all elements in the array are 0
        for (int i = 0; i < 52; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
