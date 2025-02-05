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