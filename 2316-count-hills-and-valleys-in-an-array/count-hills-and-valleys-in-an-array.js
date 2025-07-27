/**
 * @param {number[]} nums
 * @return {number}
 */
var countHillValley = function (nums) {
    // Step 1: Remove consecutive duplicates
    const arr = [nums[0]];

    for (let i = 1; i < nums.length; i++) {
        if (nums[i] !== nums[i - 1]) {
            arr.push(nums[i]);
        }
    }


    // Step 2: Count hills and valleys
    let count = 0;
    for (let i = 1; i < arr.length - 1; i++) {
        if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
            count++; // hill
        } else if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
            count++; // valley
        }
    }

    return count;
};