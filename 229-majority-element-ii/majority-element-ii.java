class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> mp = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        int mini = n/3 + 1;
        
        for(int i = 0; i < n; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0)+1);
            
            if(mp.get(nums[i])  == mini){
                res.add(nums[i]);
            }

            if(res.size() == 2) break;
        }

        return res;
    }
}