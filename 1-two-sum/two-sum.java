class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> mp = new HashMap<>(); // key: nums[i] & value: index

        for(int i = 0; i < n; i++){
            int remain = target - nums[i];
            if(mp.containsKey(remain)){
                return new int[] {i, mp.get(remain)};
            }else{
                mp.put(nums[i], i);
            }
        }

        return null;
    }
}