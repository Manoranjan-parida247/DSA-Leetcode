// Question Link -> https://leetcode.com/problems/single-number/


// Time complexity -> O(N);
// Space Complexity -> O(N)
/*
class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int i = 0; i < n; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0)+1);
        }

        for(Map.Entry<Integer, Integer> it: mp.entrySet()){
            if(it.getValue() == 1){
                return it.getKey();
            }
        }
        return -1;
    }
}
*/
// Time complexity -> O(N);
// Space Complexity -> O(1)

class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;

        for(int num : nums){
            res = res ^ num;
        }

        return res;
    }
}