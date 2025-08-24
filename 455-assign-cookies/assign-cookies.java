class Solution {
    public int findContentChildren(int[] g, int[] s) {
        // g -> children
        // s -> cookies

        int i = 0;  // children
        int j = 0; //cookies

        int m = g.length; //children size
        int n = s.length; //cookies size

        Arrays.sort(g);
        Arrays.sort(s);

        while(i < m && j < n){
            if(s[j] >= g[i]){
                i++;
            }
            j++;
        }

        return i;

    }
}