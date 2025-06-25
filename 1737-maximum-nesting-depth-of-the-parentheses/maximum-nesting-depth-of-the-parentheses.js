/**
 * @param {string} s
 * @return {number}
 */
var maxDepth = function(s) {
    let ans = 0;
    let leftBracketCount = 0;

    for(const char of s){
        if(char === '('){
            leftBracketCount++;
            ans = Math.max(ans, leftBracketCount);
        }else if(char === ')'){
            leftBracketCount--;
        }
    }

    return ans;
};