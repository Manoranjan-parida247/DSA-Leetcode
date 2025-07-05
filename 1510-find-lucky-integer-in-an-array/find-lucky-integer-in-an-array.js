/**
 * @param {number[]} arr
 * @return {number}
 */
var findLucky = function(arr) {
    const freqMap = new Map();

    for(const num of arr){
        freqMap.set(num, (freqMap.get(num)||0)+1);
    }

    let lucky = -1;
    for(const num of arr){

        if(freqMap.get(num) === num){
            lucky = Math.max(lucky, num);
        }
        
    }

    return lucky;
};