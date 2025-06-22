/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isIsomorphic = function(s, t) {
    if(s.length !== t.length) return false;

    const mp = new Map();
    const used = new Set(); 

    for(let i = 0; i < s.length; i++){
        const charS = s[i];
        const charT = t[i];

        if(mp.has(charS)){
            if(mp.get(charS) !== charT) return false;
        }else{
            if(used.has(charT)) return false;
            mp.set(charS, charT);
            used.add(charT);
        }
    }
    return true;
};