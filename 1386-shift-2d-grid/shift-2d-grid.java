class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        List<List<Integer>> ans = new ArrayList<>();

        int rows = grid.length;
        int cols = grid[0].length;

        int[] nums = new int[rows * cols];
        int n = nums.length;

        int idx = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                nums[idx++] = grid[i][j];
            }
        }

        k %= n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);

        idx = 0;

        for (int i = 0; i < rows; i++) {

            List<Integer> temp = new ArrayList<>();

            for (int j = 0; j < cols; j++) {
                temp.add(nums[idx++]);
            }

            ans.add(temp);
        }

        return ans;
    }

    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}