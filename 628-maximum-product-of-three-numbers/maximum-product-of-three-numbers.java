class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        
        // two smallest negatiove and largest positive
        int option1 = nums[0] * nums[1] * nums[n-1];

        // Three largest positeve
        int option2 = nums[n-1] * nums[n-2] * nums[n-3];

        return Math.max(option1, option2);
    }
}