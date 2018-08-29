class Solution {
    private int n;
    private int m;
    public int numIslands(char[][] grid) {
        int count = 0;
        n = grid.length;
        if(n == 0)
            return 0;       
        m = grid[0].length;
        for(int i = 0; i < n;i++){
            for(int j = 0; j < m;j++){
                if(grid[i][j] =='1'){
                dfs(i,j,grid);
                count++;
                }
            }
        }
        return count;
    }
    public void dfs(int i, int j, char[][] grid){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]!='1') return;       
            grid[i][j] = '0';
            dfs(i+1,j,grid);
            dfs(i-1,j,grid);
            dfs(i,j+1,grid);
            dfs(i,j-1,grid);     
    }
}