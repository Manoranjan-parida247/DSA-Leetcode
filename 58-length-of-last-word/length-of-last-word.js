/**
 * @param {string} s
 * @return {number}
 */

// solution 1-> using inbuilt method
//  var lengthOfLastWord = function(s) {
//     s = s.trim();
//     s = s.split(" ");
//     return s[s.length-1].length;
// }

// solution 2 -
var lengthOfLastWord = function(s) {
    //step 1 - trim all the spaces at the end
    let lastNonSpaceCharIdx = -1;

    for(let i = s.length-1; i >= 0 ; i--){
        if(s[i] !== ' '){
            lastNonSpaceCharIdx = i;
            break;
        }
    }

    //step 2 - count the character till you reach the last space
    let count = 0;
    for(let i = lastNonSpaceCharIdx; i >= 0; i--){
        if(s[i] !== ' '){
            count++;
        }else{
            break;
        }
    }
    return count;
};


