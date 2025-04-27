class Solution {
    public int countSubarrays(int[] nums) {
        int res = 0;
        if(nums.length < 3){
            return res;
        }

        for(int i = 0; i < nums.length - 2; i++){
            if((2*(nums[i] + nums[i+2])) == nums[i+1]){
                res++;
            }
        }
        return res;
    }
}