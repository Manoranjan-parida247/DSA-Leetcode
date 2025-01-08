class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        int actualSum = n * (n + 1) / 2;
        int expectedSum = 0;

        for(int num : nums){
            expectedSum += num;
        }

        return actualSum - expectedSum;
    }
}