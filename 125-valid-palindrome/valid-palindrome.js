/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    let filtertedString = "";
    s = s.toLowerCase();

    for(let i = 0; i < s.length; i++){
        if((s[i] >= 'a' && s[i] <= 'z') || (s[i] >= '0' && s[i] <= '9')){
            filtertedString += s[i];
        }
    }

    let left = 0;
    let right = filtertedString.length - 1;

    while(left < right){
        if(filtertedString[left] !== filtertedString[right]){
            return false;
        }
        left++;
        right--;
    }
    return true;
};