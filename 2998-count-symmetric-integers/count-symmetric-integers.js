/**
 * @param {number} low
 * @param {number} high
 * @return {number}
 */
var countSymmetricIntegers = function(low, high) {
    let count = 0;

    for (let num = low; num <= high; num++) {
        let s = num.toString();
        let len = s.length;

        if (len % 2 !== 0) {
            continue;
        }

        let leftSum = 0, rightSum = 0;

        for (let i = 0; i < len / 2; i++) {
            leftSum += parseInt(s[i]);
        }

        for (let i = len / 2; i < len; i++) {
            rightSum += parseInt(s[i]);
        }

        if (leftSum === rightSum) {
            count++;
        }
    }

    return count;
};