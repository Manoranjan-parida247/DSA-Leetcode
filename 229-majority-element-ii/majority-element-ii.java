class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int mini = n/3;
        List<Integer> res = new ArrayList<>();

        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        int cnt1 = 0;
        int cnt2 = 0;

        for(int i = 0; i < n; i++){
            if(cnt1 == 0 && nums[i] != el2){
                cnt1++;
                el1 = nums[i];
            }else if(cnt2 == 0 && nums[i] != el1){
                cnt2++;
                el2 = nums[i];
            }else if(nums[i] == el1){
                cnt1++;
            }else if(nums[i] == el2){
                cnt2++;
            }else{
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = 0;
        cnt2 = 0;

        for(int num : nums){
            if(num == el1) cnt1++;
            if(num == el2) cnt2++;
        }

        if(cnt1 > mini){
            res.add(el1);
        }

        if(cnt2 > mini && el2 != el1){
            res.add(el2);
        }

        return res;
    }
}