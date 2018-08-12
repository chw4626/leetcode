class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false;
        int m = matrix.length, n = matrix[0].length;
        int low = 0, high = m * n - 1;
        while(low <= high) {
            int mid = low + (high - low)/2;
            int midX = mid / n, midY = mid % n;
            if(matrix[midX][midY] == target) return true;
            if(matrix[midX][midY] < target) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }
}