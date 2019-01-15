class Solution {
    public double knightProbability(int N, int K, int r, int c) {
        int[][] dir = {{1, 2}, {1, -2}, {2, 1}, {2, -1}, {-1, 2}, {-1, -2}, {-2, 1}, {-2, -1}};
        double dp0[][] = new double[N][N];
        for(double[] row : dp0) Arrays.fill(row, 1);
        for(int k = 0; k < K; k++){
            double[][] dp1 = new double[N][N];
            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++){
                    for(int m = 0; m < 8; m++){
                        int x = i + dir[m][0];
                        int y = j + dir[m][1];
                        if(x < 0 || y < 0 || x >= N || y >= N)
                            continue;
                        dp1[x][y] += dp0[i][j];
                    }
                }
            }
            dp0 = dp1;
        }
        return dp0[r][c] / Math.pow(8, K); 
    }
}