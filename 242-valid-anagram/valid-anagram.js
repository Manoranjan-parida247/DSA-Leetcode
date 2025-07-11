/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
    if(s.length !== t.length) return false;

    const sFreqArr = new Array(26).fill(0);

    for(let i = 0; i < s.length; i++){
        sFreqArr[s[i].charCodeAt(0) - 'a'.charCodeAt(0)]++;
        sFreqArr[t[i].charCodeAt(0) - 'a'.charCodeAt(0)]--;
    }

    // for(let i = 0; i < t.length; i++){
    //     sFreqArr[t[i].charCodeAt(0) - 'a'.charCodeAt(0)]--;
    // }

    for(const freq of sFreqArr){
        if(freq !== 0) return false;
    }

    return true;
};