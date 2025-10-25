class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int posIdx = 0; //{0, 2, 4, 6}
        int negIdx = 1; //{1, 3, 5, 7}

        for(int i = 0; i < n; i++){
            if(nums[i] > 0){
                res[posIdx] = nums[i];
                posIdx += 2;
            }else{
                res[negIdx] = nums[i];
                negIdx += 2;
            }
        }

        return res;
    }
}