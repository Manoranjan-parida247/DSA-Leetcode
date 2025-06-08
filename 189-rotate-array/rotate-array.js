/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */

 const reverse = (arr, start, end) =>{
    while(start < end){
        const temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
 }
var rotate = function(nums, k) {
    const n = nums.length;
    k = k % n;

    reverse(nums, n-k, n-1);
    reverse(nums, 0, n-k-1);
    reverse(nums, 0, n-1);
};