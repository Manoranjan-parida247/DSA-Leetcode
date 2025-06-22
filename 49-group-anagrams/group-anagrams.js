/**
 * @param {string[]} strs
 * @return {string[][]}
 */

//  ✅ Code (Sorted Version):
var groupAnagrams = function(strs) {
    const map = new Map();

    for(let str of strs){
        // Sort characters of the string to form the key
        const sortedStr = str.split('').sort().join('');

        if(!map.has(sortedStr)){
            map.set(sortedStr, [str]);
        }else{
            map.get(sortedStr).push(str);
        }

        
    }

    return Array.from(map.values());
};