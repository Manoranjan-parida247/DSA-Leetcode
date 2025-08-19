
//correct but 46/48 taste case
// class Solution {
//     public long zeroFilledSubarray(int[] nums) {
//         //number of subarray = (n * (n+1))/ 2;
//         // TC - O(N)
//         long ans = 0;
//         int n = nums.length;
//         int i = 0;

//         while(i < n){
//             if(nums[i] != 0){
//                 i++;
//                 continue;
//             }
//             int count = 0;
//             while(i < n && nums[i] == 0){
//                 count++;
//                 i++;
//             }
//             ans = ans + (long) (count * (count + 1)) / 2;
//         }
//         return ans;
//     }
// }

class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        long count = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                count++;
                ans = ans + count;
            }else{
                count = 0;
            }
        }
        return ans;
    }
}