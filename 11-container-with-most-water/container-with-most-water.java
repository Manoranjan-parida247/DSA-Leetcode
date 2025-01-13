class Solution {
    public int maxArea(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            return 0; // Not enough lines to hold water
        }

        int left = 0, right = n - 1;
        int maxWater = 0;

        while (left < right) {
            // Calculate the width of the container
            int width = right - left;

            // Calculate the height of the container as the min of the two lines
            int height = Math.min(arr[left], arr[right]);
            
            // Calculate the area and update the maximum water
            int currentWater = width * height;
            maxWater = Math.max(maxWater, currentWater);

            // Move the pointer of the shorter line inward
            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }
}