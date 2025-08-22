class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans = 0;
        for (int i = 0; i < stones.length(); i++) {
            char currStone = stones.charAt(i);
            for (int j = 0; j < jewels.length(); j++) {
                if (currStone == jewels.charAt(j)) {
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}