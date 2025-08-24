class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int zeroCount = 0;

        int i = 0; 
        int j = 0;

        int ans = 0;

        while(j < n){
            if(nums[j] == 0){
                zeroCount++;
            }

            while(zeroCount > 1){
                if(nums[i] == 0){
                    zeroCount--;
                }
                i++;
            }
            // valid window: length is j - i + 1, but delete one element
            ans = Math.max(ans, j-i);
            j++;
        }

        return ans;
    }
}