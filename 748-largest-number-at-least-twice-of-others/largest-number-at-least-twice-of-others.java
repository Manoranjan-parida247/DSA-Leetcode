class Solution {
    public int dominantIndex(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            boolean isLargest = true;
            for(int j = 0; j < nums.length; j++){
                if(i == j) continue;

                if(nums[i] < 2*nums[j]){
                    isLargest = false;
                    break;
                }
            }

            if(isLargest) return i;
        }

        return -1;
    }
}