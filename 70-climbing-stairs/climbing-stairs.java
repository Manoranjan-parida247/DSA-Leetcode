class Solution {
    public int climbStairs(int n) {
        int prevStep2 = 1;
        int prevStep = 1;

        for(int i = 2; i <= n; i++){
            int currStep = prevStep + prevStep2;
            prevStep2 = prevStep;
            prevStep = currStep;
        }

        return prevStep;
    }
}