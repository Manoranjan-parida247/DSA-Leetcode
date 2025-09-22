class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        // Step 1: Count frequencies
        for(int i = 0; i < nums.length; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0)+1);
        }

        // Step 2: Find maximum frequency
        int maxFreq = 0;
        for(int freq : mp.values()){
            maxFreq = Math.max(freq, maxFreq);
        }

        // Step 3: Count total elements with maximum frequency
        int total = 0;
        for(int freq : mp.values()){
            if(freq == maxFreq){
                total += freq;
            }
        }

        return total;
    }
}