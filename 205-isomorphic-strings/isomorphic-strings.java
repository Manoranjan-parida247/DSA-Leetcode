class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        int m = t.length();

        if(n != m) return false;

        HashMap<Character, Character> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            char chS = s.charAt(i);
            char chT = t.charAt(i);

            if(map.containsKey(chS)){ // key already exist
                if(map.get(chS) != chT){
                    return false;
                }
            }else if(map.containsValue(chT)){ // value already exist
                return false;
            }else{
                map.put(chS, chT); // mapping doesn't exist
            }
        }

        return true;
    }
}