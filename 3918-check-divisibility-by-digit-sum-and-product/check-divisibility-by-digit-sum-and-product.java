class Solution {
    public boolean checkDivisibility(int n) {
        int digitsSum = digitsSumN(n);
        int digitsProduct = digitsProductN(n);
        System.out.println(digitsSum);
        System.out.println(digitsProduct);
        int sum = digitsSum + digitsProduct;

        return n % sum == 0;
    }
    private int digitsSumN(int n){
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }
    private int digitsProductN(int n){
        int res = 1;
        while(n > 0){
            int digit = n % 10;
            res *= digit;
            n /= 10;
        }

        return res;
    }
}