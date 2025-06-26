/**
 * @param {string} s
 * @param {number} k
 * @return {number}
 */
var longestSubsequence = function (s, k) {
    const n = s.length;
    let length = 0;
    let binaryValue = 0;

    for (let i = n - 1; i >= 0; i--) {
        if (s[i] === '0') {
            length++;
        } else {
            binaryValue += (2 ** (n - i - 1));
            if (binaryValue <= k) {
                length++;
            } else {
                // binaryValue -= (2 ** (n - i - 1));
                binaryValue -= (n-i-1) << 1;

            }

        }
    }
    return length;
};