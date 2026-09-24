class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int digitSum = findDigitSum(nums[i]);
            if(i == digitSum){
                return i;
            }
        }

        return -1;
    }
    private int findDigitSum(int n){
        if(n < 10) return n;
        int sum = 0;

        while(n > 0){
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }

        return sum;
    }
}