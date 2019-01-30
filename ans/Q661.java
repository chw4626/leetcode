class Solution {
    public int[][] imageSmoother(int[][] M) {
        int n = M.length;
        int c = M[0].length;
        int[][] res = new int[n][c];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < c; j++){
                int count = 0;
                for(int na = i - 1; na <= i + 1; na++){
                    for(int ca = j - 1; ca <= j + 1; ca++){
                        if(na >= 0 && na < n && ca >= 0 && ca < c){
                            res[i][j] += M[na][ca];
                            count++;
                        }
                    }
                }
                res[i][j] /= count;
            }
        }
        return res;
    }
}