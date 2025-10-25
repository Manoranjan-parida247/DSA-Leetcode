class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] pos = new int[n/2];
        int[] neg = new int[n/2];
        int[] res = new int[n];

        int posIdx = 0;
        int negIdx = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] > 0){
                pos[posIdx++] = nums[i];
            }else{
                neg[negIdx++] = nums[i];
            }
        }

        posIdx = 0;
        negIdx = 0;

        for(int i = 0; i < n; i+=2){
            res[i] = pos[posIdx++];
            res[i+1] = neg[negIdx++];
        }

        return res;
    }
}