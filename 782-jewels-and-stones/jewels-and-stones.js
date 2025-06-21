/**
 * @param {string} jewels
 * @param {string} stones
 * @return {number}
 */

 //brute fprce 
// var numJewelsInStones = function(jewels, stones) {
//     let ans = 0;
//     for(let i = 0; i < stones.length; i++){
//         let currStone = stones[i];
//         for(let j = 0; j < jewels.length; j++){
//             if(currStone === jewels[j]){
//                 ans++;
//                 break;
//             }
//         }
//     }
//     return ans;
// };


//optimal
var numJewelsInStones = function(jewels, stones) {
    let ans = 0;
    const set = new Set();
    for(let i = 0; i < jewels.length; i++){
        set.add(jewels[i]);
    }

    for(let i = 0; i < stones.length; i++){
        if(set.has(stones[i])){
            ans++;
        }
    }
    return ans;
}
