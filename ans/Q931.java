class Solution {
    public int minFallingPathSum(int[][] A) {
        int count = 0;
        int m = A.length, n = A[0].length;
        for(int i = 1; i < m; i++){
            for(int j = 0; j < n; j++){
                    A[i][j] += Math.min(A[i-1][j],Math.min(A[i-1][Math.max(0,j-1)],A[i-1][Math.min(j+1,n-1)]));
            }            
        }
        Arrays.sort(A[m-1]);
        return A[m-1][0];
    }
}