class Solution {
    public int countCommas(int n) {
        int count = 0;
        for(int i = 1000; i <= n; i++){
            int noOfDigits = String.valueOf(i).length();
            int commas = noOfDigits % 3 == 0 ? (noOfDigits/3)-1 : (noOfDigits / 3);
            count += commas;
        }

        return count;
    }
}