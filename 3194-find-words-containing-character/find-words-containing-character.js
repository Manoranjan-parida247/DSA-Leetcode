/**
 * @param {string[]} words
 * @param {character} x
 * @return {number[]}
 */
// var findWordsContaining = function(words, x) {
//     const res = [];

//     for(let i = 0; i < words.length; i++){
//         if(words[i].includes(x)){
//             res.push(i);
//         }
//     }
//     return res;
// };

var findWordsContaining = function (words, x) {
    const res = [];

    for(let i = 0; i < words.length; i++){
        let str = words[i];
        for(let j = 0; j < str.length; j++){
            if(str[j] === x){
                res.push(i);
                break;
            }
        }
    }
    return res;
}