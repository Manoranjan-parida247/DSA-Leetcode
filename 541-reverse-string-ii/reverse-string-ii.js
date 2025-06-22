/**
 * @param {string} s
 * @param {number} k
 * @return {string}
 */
var reverseStr = function(s, k) {
    let arr = s.split('');

    for(let i = 0; i < s.length; i += 2 *k  ){
        // Determine the end index for reversal
        let left = i;
        let right = Math.min(i+k-1, arr.length-1);

        // Reverse characters between left and right

        while(left < right){
            const temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    return arr.join('');
};