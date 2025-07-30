
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, 0, new ArrayList<>(), 0, target, result);
        return result;
    }

    private void backtrack(int[] arr, int idx, List<Integer> current, int sum, int target, List<List<Integer>> result) {
        if (sum == target) {
            result.add(new ArrayList<>(current)); // found a valid combination
            return;
        }

        if (idx == arr.length || sum > target) {
            return;
        }

        // Include the current element
        current.add(arr[idx]);
        backtrack(arr, idx, current, sum + arr[idx], target, result); // reuse allowed
        current.remove(current.size() - 1); // backtrack

        // Exclude the current element and move to next
        backtrack(arr, idx + 1, current, sum, target, result);
    }
}
