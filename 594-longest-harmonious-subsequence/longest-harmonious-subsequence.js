/**
 * @param {number[]} nums
 * @return {number}
 */
var findLHS = function(nums) {
    const freqMap = new Map();

    for(const num of nums){
        freqMap.set(num, (freqMap.get(num) || 0)+1);
    }

    let res = 0;

    for(const num of nums){
        let min = num;
        let max = num + 1;

        if(freqMap.has(max)){
            res = Math.max(res , freqMap.get(max) + freqMap.get(min));
        }
    }

    return res;
};