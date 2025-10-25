class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx = -1;

        // Step 1: Find the first decreasing element from the end
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx = i;
                break;
            }
        }

        if (idx == -1) {
            // Already the last permutation, just reverse the whole array
            reverse(nums, 0, n - 1);
        } else {
            // Step 2: Find the next greater element to swap
            for (int i = n - 1; i > idx; i--) {
                if (nums[i] > nums[idx]) {
                    swap(nums, i, idx);
                    break;
                }
            }

            // Step 3: Reverse the suffix
            reverse(nums, idx + 1, n - 1);
        }
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
