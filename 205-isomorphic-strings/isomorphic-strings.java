class Solution {
    public boolean isIsomorphic(String s, String t) {
        // If lengths differ, not isomorphic
        if (s.length() != t.length()) return false;

        // Maps characters from s -> t
        Map<Character, Character> map = new HashMap<>();
        // Keeps track of characters in t already mapped
        Set<Character> used = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // Case 1: If mapping already exists
            if (map.containsKey(charS)) {
                // Check consistency
                if (map.get(charS) != charT) {
                    return false;
                }
            } 
            // Case 2: If no mapping exists yet
            else {
                // But if target char already used -> conflict
                if (used.contains(charT)) {
                    return false;
                }
                // Create new mapping
                map.put(charS, charT);
                used.add(charT);
            }
        }
        return true; // All checks passed
    }
}
