/**
 * @param {number[]} nums
 * @return {boolean}
 */
var check = function(nums) {
    let n = nums.length;
    let peak = 0;

    for (let i = 1; i < n; i++) {
        if (nums[i - 1] > nums[i]) {
            peak++;
        }
    }

    if (nums[n - 1] > nums[0]) {
        peak++;
    }

    return peak <= 1;
};