class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        // int n = nums.length;
        int x = 1;
        while(true){
            int isPresent = k * x;
            if(!set.contains(isPresent)){
                return isPresent;
            }
            x++;
        }

        // return -1;
    }
}