class Solution {
    public long coloredCells(int n) {
        return 1 + (2L * (long)(n-1) * n);
    }
}