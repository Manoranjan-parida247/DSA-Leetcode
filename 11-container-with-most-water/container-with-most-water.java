class Solution {
    public int maxArea(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int maxWater = 0;

        while(left < right){
            int width = right - left;
            int height = Math.min(arr[left], arr[right]);

            maxWater = Math.max(maxWater, width * height);

            if(arr[left] < arr[right]){
                left++;
            }else{
                right--;
            }
        }

        return maxWater;
    }
}