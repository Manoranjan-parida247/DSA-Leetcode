/**
 * @param {string[]} strs
 * @return {string[][]}
 */

//  ✅ Code (Sorted Version):
// var groupAnagrams = function(strs) {
//     const map = new Map();

//     for(let str of strs){
//         // Sort characters of the string to form the key
//         const sortedStr = str.split('').sort().join('');

//         if(!map.has(sortedStr)){
//             map.set(sortedStr, [str]);
//         }else{
//             map.get(sortedStr).push(str);
//         }

        
//     }

//     return Array.from(map.values());
// };


//  ✅ Code (without key Sorted Version):
var groupAnagrams = function(strs) {
    const mp = new Map();

    for(let str of strs){
        const freqArr = new Array(26).fill(0);

        for(let ch of str){
            freqArr[ch.charCodeAt(0) - 'a'.charCodeAt(0)]++;
        }

        let key = freqArr.join('#');

        if(!mp.has(key)){
            mp.set(key, [str]);
        }else{
            mp.get(key).push(str);
        }
    }
    return Array.from(mp.values());
}
