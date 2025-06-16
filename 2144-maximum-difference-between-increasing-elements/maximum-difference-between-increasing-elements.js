/**
 * @param {number[]} nums
 * @return {number}
 */
var maximumDifference = function(nums) {
    let minElem = nums[0];
    let maxDiff = 0;
    const n = nums.length;

    for(let j = 1; j < n; j++){
        if(nums[j] > minElem){
            maxDiff = Math.max(maxDiff, nums[j]-minElem);
        }else{
            minElem = nums[j];
        }
    }

    return maxDiff === 0 ? -1 : maxDiff;
};