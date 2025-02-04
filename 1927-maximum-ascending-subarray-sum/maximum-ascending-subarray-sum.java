class Solution {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            int sum = nums[i];
            int j = i+1;

            while(j < n  && nums[j] > nums[j-1]){
                sum += nums[j];
                j++;
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}