class Solution {
    public int maximum69Number (int num) {
        // Convert the number into a char array
        char[] digits = String.valueOf(num).toCharArray();

        // Find the first '6' from the left and change it to '9'

        for(int i = 0; i < digits.length; i++){
            if(digits[i] == '6'){
                digits[i] = '9';
                break; // only change the first '6'
            }
        }
        // Convert back to integer and return
        return Integer.parseInt(new String(digits));
    }
}