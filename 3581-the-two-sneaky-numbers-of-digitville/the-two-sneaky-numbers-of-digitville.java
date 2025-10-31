class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> mp = new HashMap<>(); // nums[i] , frequency
        int []res = new int[2];
        int idx = 0;

        for(int i = 0; i < n; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0)+1);
            if(mp.get(nums[i])  == 2){
                res[idx++] = nums[i];
            }

            if(idx == 2){
                break;
            }
        }

        return res;
    }
}