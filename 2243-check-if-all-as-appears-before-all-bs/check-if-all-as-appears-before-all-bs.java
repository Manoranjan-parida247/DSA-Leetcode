class Solution {
    public boolean checkString(String s) {
        int firstBidx = -1;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'b'){
                firstBidx = i;
                break;
            }
        }

        if(firstBidx == -1) return true;

        for(int i = firstBidx+1; i < s.length(); i++){
            if(s.charAt(i) == 'a'){
                return false;
            }
        }

        return true;
    }
}