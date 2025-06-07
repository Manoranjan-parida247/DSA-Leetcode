/**
 * @param {number[]} nums
 * @return {boolean}
 */
var check = function(nums) {
    const n = nums .length;
    let peak = 0;

    for(let i = 0; i < n-1; i++){
        if(nums[i] > nums[i+1]){
            peak++;
        }
    }

    if(nums[n-1] > nums[0]){
        peak++;
    }

    return peak <= 1;
};