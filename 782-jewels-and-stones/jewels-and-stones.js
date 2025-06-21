/**
 * @param {string} jewels
 * @param {string} stones
 * @return {number}
 */
var numJewelsInStones = function(jewels, stones) {
    let ans = 0;
    for(let i = 0; i < stones.length; i++){
        let currStone = stones[i];
        for(let j = 0; j < jewels.length; j++){
            if(currStone === jewels[j]){
                ans++;
                break;
            }
        }
    }
    return ans;
};