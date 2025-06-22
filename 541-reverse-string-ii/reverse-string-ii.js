/**
 * @param {string} s
 * @param {number} k
 * @return {string}
 */
var reverseStr = function (s, k) {
    let arr = s.split('');

    for (let i = 0; i < arr.length; i += 2 * k) {
        let left = i;
        let remaining = arr.length - left;

        if (remaining < k) {
            reverse(arr, left, arr.length - 1);
        } else {
            reverse(arr, left, left + k - 1);
        }
    }

    return arr.join('');
};

const reverse = (arr, left, right) => {
    while (left < right) {
        const temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
    }
}