class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Initialize pointers for nums1, nums2, and the merged array
        int i = m - 1; // Pointer for the last valid element in nums1
        int j = n - 1; // Pointer for the last element in nums2
        int k = m + n - 1; // Pointer for the last position in nums1 array

        // Loop until we have processed all elements in nums2
        while (j >= 0) {
            // If nums1 has valid elements and nums1[i] is greater than nums2[j]
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i]; // Move nums1[i] to the current merge position
                k--;
                i--;
            } else {
                // Otherwise, place nums2[j] in the current merge position
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
    }
}
/*
Complexity ->

Time complexity: O(m+n)
We are iterating through both arrays once, so the time complexity is O(m+n).

Space complexity: O(1)
We are not using any extra space, so the space complexity is O(1).

*/

/*
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }
}

Complexity
Time complexity: O((m+n)log(m+n))
due to the sort() function

Space complexity: O(1)
We are not using any extra space, so the space complexity is O(1).

*/