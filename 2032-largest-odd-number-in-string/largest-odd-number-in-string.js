/**
 * @param {string} num
 * @return {string}
 */
var largestOddNumber = function(num) {
    let ans = "";
let oddNumIdx = -1;
    for(let i = num.length - 1; i >= 0; i--){
        if(Number(num[i]) % 2 !== 0){
            oddNumIdx = i;
            break;
        }
    }

    if(oddNumIdx === -1) return "";

    for(let i = 0; i <= oddNumIdx; i++){
        ans += num[i];
    }
    return ans;
};