class Solution {
    public int maximumCount(int[] nums) {
        
        IntPredicate lambdaP = num -> num > 0;
        IntPredicate lambdaN = num -> num < 0;
        
        int positiveCount = (int) Arrays.stream(nums).filter(lambdaP).count();
        int negativeCount = (int) Arrays.stream(nums).filter(lambdaN).count();

        return Math.max(positiveCount, negativeCount);
        
    }
}