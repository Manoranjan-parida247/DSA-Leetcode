class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1); // Setting 0 in the map.

        int currSum = 0;
        int subArrayCount = 0;

        for(int i = 0; i < n; i++){
            currSum += nums[i];

            int sumToRemove = currSum - k;

            subArrayCount = subArrayCount + mp.getOrDefault(sumToRemove, 0);

            mp.put(currSum, mp.getOrDefault(currSum, 0)+1);
        }

        return subArrayCount;

    }
}