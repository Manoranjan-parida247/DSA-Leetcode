class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int majority = n / 2;
        HashMap<Integer, Integer> map = new HashMap<>(); // nums[i], freq

        for(int i = 0; i < n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if(map.get(nums[i]) > majority) return nums[i];
        }

        return -1;
    }
}