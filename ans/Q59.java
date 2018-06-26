class Solution {
    public int[][] generateMatrix(int n) {
        int startx = 0,starty = 0,endx = n-1,endy = n-1;
        int[][] res = new int[n][n];
        int count = 1;
        while(startx <= endx && starty <= endy){
            for(int i = startx; i<= endx;i++){
                res[starty][i] = count;
                count++;
            }
            starty++;
            
            for(int i = starty; i<= endy; i++){
                res[i][endx] = count;
                count++;
            }
            endx--;
            
            for(int i = endx; i>= startx;i--){
                res[endy][i] = count;
                count++;
            }
            endy--;
            
            for(int i = endy; i>= starty;i--){
                res[i][startx] = count;
                count++;
            }
            startx++;
        }
        return res;
    }
}