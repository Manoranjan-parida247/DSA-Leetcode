/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var numSubseq = function(nums, target) {
    const n = nums.length;
    const M = 1_000_000_007;
    
    nums.sort((a, b) => a - b); // Sort the array in non-decreasing order

    // Precompute powers of 2
    const power = new Array(n).fill(1);
    for (let i = 1; i < n; i++) {
        power[i] = (power[i - 1] * 2) % M;
    }

    let l = 0, r = n - 1;
    let result = 0;

    while (l <= r) {
        if (nums[l] + nums[r] <= target) {
            result = (result + power[r - l]) % M;
            l++;
        } else {
            r--;
        }
    }

    return result;
};