//Approach-1
//T.C : Linear
//S.C : Extra space map
// public class Solution {
//     public char findTheDifference(String s, String t) {
//         Map<Character, Integer> mp = new HashMap<>();
        
//         for (char ch : s.toCharArray()) {
//             mp.put(ch, mp.getOrDefault(ch, 0) + 1);
//         }
        
//         for (char ch : t.toCharArray()) {
//             mp.put(ch, mp.getOrDefault(ch, 0) - 1);
            
//             if (mp.get(ch) < 0)
//                 return ch;
//         }
        
//         return 'a'; // send any random character; it will never reach here
//     }
// }


//Approach-2 (Using Sum Difference)
//T.C : Lines
//S.C : constant
public class Solution {
    public char findTheDifference(String s, String t) {
        int sum = 0;
        for(int i = 0; i < t.length(); i++)
        {
            sum += t.charAt(i);
        }

        for(int i = 0; i < s.length(); i++)
        {
            sum -= s.charAt(i);
        }
        return (char)sum;
    }
}