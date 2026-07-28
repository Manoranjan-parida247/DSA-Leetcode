class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        int elem = -1;

        for(int i = 0; i < n; i++){
            if(cnt == 0){
                elem = nums[i];
                cnt = 1;
            }else if(elem == nums[i]){
                cnt++;
            }else{
                cnt--;
            }
        }

        return elem;
    }
}