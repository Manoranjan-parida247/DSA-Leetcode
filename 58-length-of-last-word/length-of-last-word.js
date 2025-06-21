/**
 * @param {string} s
 * @return {number}
 */
// var lengthOfLastWord = function(s) {
//     //step 1 - trim all the spaces at the end



//     //step 2 - count the character till you reach the last space
// };

var lengthOfLastWord = function(s) {
    s = s.trim();
    s = s.split(" ");
    return s[s.length-1].length;
}
