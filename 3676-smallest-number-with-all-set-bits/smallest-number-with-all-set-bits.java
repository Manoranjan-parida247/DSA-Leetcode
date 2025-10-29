class Solution {
    public int smallestNumber(int n) {
        // Possible valid numbers are 1 (1), 3 (11), 7 (111), 15 (1111), 31 (11111), etc.
        // These numbers are of the form 2^k - 1.
        // k = 1 → 2^1 - 1 = 1
        // k = 2 → 2^2 - 1 = 3
        // k = 3 → 2^3 - 1 = 7
        // k = 4 → 2^4 - 1 = 15
        // k = 5 → 2^5 - 1 = 31

        int k = 1;

        while(true){
            int x = (1 << k) - 1; //// 2^k - 1
            if(x >= n) return x; //answer always return from here
            k++;
        }

        // return -1; //will not execute
    }
}