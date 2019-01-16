class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int[] hp = new int[n*n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++)
                hp[(i)*n+j] = (matrix[i][j]);
        }
        Arrays.sort(hp);
        return hp[k-1];
    }
}