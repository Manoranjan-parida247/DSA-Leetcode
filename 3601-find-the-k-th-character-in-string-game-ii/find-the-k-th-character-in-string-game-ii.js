/**
 * @param {number} k
 * @param {number[]} operations
 * @return {character}
 */
var kthCharacter = function (k, operations) {
    //base case 
    if (k == 1) return 'a';

    const n = operations.length;
    let opType = 0;
    let len = 1;
    let newK = k;

    for (let i = 0; i < n; i++) {
        len *= 2;
        if (len >= k) {
            opType = operations[i];
            newK = k - len / 2;
            break;
        }
    }

    const res = kthCharacter(newK, operations);


    if (opType === 0) return res;

    return res === 'z' ? 'a' : String.fromCharCode(res.charCodeAt(0) + 1);
};