class Solution {
    public int[] sumZero(int n) {
        int i = 0;
        int j = n-1;
        int res[] = new int[n];
        int start = 1;

        while(i < j){
            res[i] = start;
            res[j] = -start;

            start++;
            i++;
            j--;
        }

        return res;
    }
}