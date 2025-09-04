class Solution {
    public int findClosest(int x, int y, int z) {
        int stepForP1 = Math.abs(z - x);
        int stepForP2 = Math.abs(z - y);

        // if(stepForP1 < stpeForP2) return 1;
        // if(stepForP1 > stpeForP2) return 2;

        // return 0; // if both are same
        return stepForP1 == stepForP2 ? 0 : (stepForP1 < stepForP2 ? 1 : 2);
    }
}