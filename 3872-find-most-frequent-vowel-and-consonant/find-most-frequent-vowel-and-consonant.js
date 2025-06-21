/**
 * @param {string} s
 * @return {number}
 */
var maxFreqSum = function (s) {
    const n = s.length;
    const freqArr = new Array(26).fill(0);

    for (let i = 0; i < n; i++) {
        const charIndex = s.charCodeAt(i) - 'a'.charCodeAt(0);
        freqArr[charIndex]++;
    }

    const vowels = new Set(['a', 'e', 'i', 'o', 'u']);
    let vowelMax = -Infinity;
    let consonantMax = -Infinity;

    for (let i = 0; i < 26; i++) {
        const char = String.fromCharCode(i + 'a'.charCodeAt(0));
        if (vowels.has(char)) {
            vowelMax = Math.max(vowelMax, freqArr[i]);
        } else {
            consonantMax = Math.max(consonantMax, freqArr[i]);
        }
    }

    return vowelMax + consonantMax;

};