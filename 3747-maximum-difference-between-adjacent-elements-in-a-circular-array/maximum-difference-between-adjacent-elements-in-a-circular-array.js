/**
 * @param {number[]} nums
 * @return {number}
 */
var maxAdjacentDistance = function(nums) {
    let maxDiff = 0;

    for (let i = 0; i < nums.length; i++) {
        const next = (i + 1) % nums.length; // circular wrap
        const diff = Math.abs(nums[i] - nums[next]);
        maxDiff = Math.max(maxDiff, diff);
    }

    return maxDiff;
};
