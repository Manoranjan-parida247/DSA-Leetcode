class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length == 1) return;
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n-k-1);
        reverse(nums, n-k, n-1);
        reverse(nums, 0, n-1);

    }
    public static void reverse(int[] arr, int left, int right){
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}