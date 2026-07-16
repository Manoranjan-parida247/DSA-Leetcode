class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length; // row
        int n = matrix[0].length; //column

        int startRow = 0;
        int endRow = m-1;

        while(startRow <= endRow){
            int midRow = startRow + (endRow - startRow) / 2;

            if(matrix[midRow][0] <= target && target <= matrix[midRow][n-1]){
                return binarySearch(matrix, target, midRow);
            }else if(target < matrix[midRow][0]){
                endRow = midRow -1;
            }else if(target > matrix[midRow][n-1]){
                startRow = midRow + 1;
            }
        }

        return false;
    }

    private boolean binarySearch(int[][] matrix, int target, int row){
        int low = 0;
        int high = matrix[0].length-1;
        
        while(low <= high){
            int mid = low + (high - low) / 2;

            if(matrix[row][mid] == target){
                return true;
            }else if(matrix[row][mid] < target){
                low = mid + 1;
            }else if(matrix[row][mid] > target){
                high = mid -1;
            }
        }

        return false;
    }
}