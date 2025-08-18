
class Solution {
    public boolean judgePoint24(int[] cards) {
        Arrays.sort(cards);
        if (isValid(cards)) return true;
        while (nextPermutation(cards)) {
            if (isValid(cards)) return true;
        }
        return false;
    }

    private boolean isValid(int[] cards) {
        double a = cards[0], b = cards[1], c = cards[2], d = cards[3];
        if (isValid(a + b, c, d) || isValid(a - b, c, d) || isValid(a * b, c, d) || isValid(a / b, c, d))
            return true;
        if (isValid(a, b + c, d) || isValid(a, b - c, d) || isValid(a, b * c, d) || isValid(a, b / c, d))
            return true;
        if (isValid(a, b, c + d) || isValid(a, b, c - d) || isValid(a, b, c * d) || isValid(a, b, c / d))
            return true;
        return false;
    }

    private boolean isValid(double a, double b, double c) {
        if (isValid(a + b, c) || isValid(a - b, c) || isValid(a * b, c) || (Math.abs(b) > 1e-9 && isValid(a / b, c)))
            return true;
        if (isValid(a, b + c) || isValid(a, b - c) || isValid(a, b * c) || (Math.abs(c) > 1e-9 && isValid(a, b / c)))
            return true;
        return false;
    }

    private boolean isValid(double a, double b) {
        double eps = 1e-6;
        return Math.abs(a + b - 24) < eps ||
               Math.abs(a - b - 24) < eps ||
               Math.abs(a * b - 24) < eps ||
               (Math.abs(b) > 1e-9 && Math.abs(a / b - 24) < eps);
    }

    // Utility function for next_permutation in Java
    private boolean nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) i--;
        if (i < 0) return false;
        int j = n - 1;
        while (nums[j] <= nums[i]) j--;
        swap(nums, i, j);
        reverse(nums, i + 1, n - 1);
        return true;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}
