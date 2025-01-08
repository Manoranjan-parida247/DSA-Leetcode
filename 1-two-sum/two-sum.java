// Question Link -> https://leetcode.com/problems/two-sum/

// Approach 1 -> Bruteforce 
// Time Complexity -> O(N^2)
// Space Complexity -> O(1)
/*
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(i == j) continue;
                if(nums[i] + nums[j] == target){
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return null;
    }
}

*/

// Approach 2 -> Optimal(HashTable) - hashMap  
// Time Complexity -> O(N)
// Space Complexity -> O(N)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> numMap = new HashMap<>(); //nums[i], index

        for(int i = 0; i < n; i++){
            int complements = target - nums[i];
            if(numMap.containsKey(complements)){
                return new int[]{i, numMap.get(complements)};
            }
            numMap.put(nums[i], i);
        }
        return null;
    }
}