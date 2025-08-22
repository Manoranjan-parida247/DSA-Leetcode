// class Solution {
//     public int numJewelsInStones(String jewels, String stones) {
//         int ans = 0;
//         for (int i = 0; i < stones.length(); i++) {
//             char currStone = stones.charAt(i);
//             for (int j = 0; j < jewels.length(); j++) {
//                 if (currStone == jewels.charAt(j)) {
//                     ans++;
//                     break;
//                 }
//             }
//         }
//         return ans;
//     }
// }

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans = 0;
        Set<Character> set = new HashSet<>();

        // Add jewels into the set
        for (int i = 0; i < jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }

        // Count stones that are jewels
        for (int i = 0; i < stones.length(); i++) {
            if (set.contains(stones.charAt(i))) {
                ans++;
            }
        }

        return ans;
    }
}