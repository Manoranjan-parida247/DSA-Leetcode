

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates); // sort to handle duplicates
        func(0, 0, new ArrayList<>(), candidates, target, ans);
        return ans;
    }

    private void func(int ind, int sum, List<Integer> nums, int[] candidates, int target, List<List<Integer>> ans) {
        if (sum == target) {
            ans.add(new ArrayList<>(nums));
            return;
        }

        if (sum > target || ind >= candidates.length) return;

        // ✅ Pick current index
        nums.add(candidates[ind]);
        func(ind + 1, sum + candidates[ind], nums, candidates, target, ans);
        nums.remove(nums.size() - 1); // backtrack

        // ✅ Not-pick handled in loop (skip duplicates)
        for (int i = ind + 1; i < candidates.length; i++) {
            if (candidates[i] != candidates[ind]) {
                func(i, sum, nums, candidates, target, ans);
                break; // break after first valid not-pick
            }
        }
    }
}
