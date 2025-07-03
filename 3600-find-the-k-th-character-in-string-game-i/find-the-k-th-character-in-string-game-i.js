/**
 * @param {number} k
 * @return {character}
 */
var kthCharacter = function(k) {
    let word = "a";

    while (word.length < k) {
        let next = "";
        for (let i = 0; i < word.length; i++) {
            let ch = word[i];
            // Get next character, wrap around 'z' to 'a'
            let nextChar = String.fromCharCode((ch.charCodeAt(0) - 97 + 1) % 26 + 97);
            next += nextChar;
        }
        word += next;
    }

    return word[k - 1]; // since k is 1-based index
};
