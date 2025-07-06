/**
 * @param {number[]} arr
 * @return {number}
 */
var findLucky = function(arr) {
    const freqMap = new Map();

    for(const num of arr){
        let count = (freqMap.get(num) || 0)  + 1;
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

// var findLucky = function(arr){
//     let map= new Map();
    
//     for(let i;i<arr.length;i++){
//         if(map.has(key)){
//             map.set(num,key+1)
//         }
//         else{
//             map
//         }
//     }
// }