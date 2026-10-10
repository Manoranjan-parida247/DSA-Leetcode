class Solution {
    public boolean containsDuplicate(int[] nums) {
        // HashSet
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < n; i++){
            if(set.contains(nums[i])){
                return true;
            }else{
                set.add(nums[i]);
            }
        }

        return false;
    }
}