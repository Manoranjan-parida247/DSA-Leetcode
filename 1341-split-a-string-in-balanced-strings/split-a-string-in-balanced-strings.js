/**
 * @param {string} s
 * @return {number}
 */
var balancedStringSplit = function (s) {
    const n = s.length;
    let lCount = 0;
    let rCount = 0;

    let ans = 0;

    for (let i = 0; i < n; i++) {
        if (s[i] === 'L') {
            lCount++;
        } else {
            rCount++;
        }

        if (lCount === rCount) {
            ans++;
            lCount = 0;
            rCount = 0;
        }
    }

    return ans;
};