class Solution {
    public boolean containsDuplicate(int[] nums) {
        // HashMap
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>(); // nums[i], it's frequency

        for(int i = 0; i < n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            if(map.get(nums[i]) >= 2) return true;
        }

        return false;
    }
}