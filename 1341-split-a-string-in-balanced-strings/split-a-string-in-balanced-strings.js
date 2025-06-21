/**
 * @param {string} s
 * @return {number}
 */
// var balancedStringSplit = function (s) {
//     const n = s.length;
//     let lCount = 0;
//     let rCount = 0;

//     let ans = 0;

//     for (let i = 0; i < n; i++) {
//         if (s[i] === 'L') {
//             lCount++;
//         } else {
//             rCount++;
//         }

//         if (lCount === rCount) {
//             ans++;
//             lCount = 0;
//             rCount = 0;
//         }
//     }

//     return ans;
// };

var balancedStringSplit = function (s) {
    let ans = 0;
    let count = 0;
    const n = s.length;

    for(const char of s){
        char === 'L' ? count++ : count-- ;
        
        if(count === 0) ans++;
        
    }
    return ans;
}