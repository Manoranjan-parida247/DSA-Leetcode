class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long sum1 = 0;
        long sum2 = 0;
        long zeroCount1 = 0;
        long zeroCount2 = 0;

        for(int num : nums1){
            if(num == 0){
                zeroCount1++;
                sum1 += 1;
                continue;
            }
            sum1 += num;
        }

        for(int num : nums2){
            if(num == 0){
                zeroCount2++;
                sum2 += 1;
                continue;
            }
            sum2 += num;
        }

        if(sum1 < sum2 && zeroCount1 == 0) return -1;
        if(sum2 < sum1 && zeroCount2 == 0) return -1;

        return Math.max(sum1, sum2);

    }
}