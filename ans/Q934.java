class Solution {
    public int shortestBridge(int[][] A) {
        int m = A.length, n = A[0].length;
        boolean[][] visited = new boolean[m][n];
        int[][] dirs = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        Queue<int[]> q = new LinkedList<>();
        boolean found = false;
        
        for(int i = 0; i < m; i++){
            if(found){
                break;
            }
            for(int j = 0; j < n; j++){
                if(A[i][j] == 1){
                    dfs(A,visited,q,i,j,dirs);
                    found = true;
                    break;
                }
            }            
        }
        int count = 0;
        while(!q.isEmpty()){
            int size = q.size();
            while(size > 0){
                size--;
                int[] curr = q.poll();
                for(int[] dir: dirs){
                    int i = curr[0] + dir[0];
                    int j = curr[1] + dir[1];
                    if(i >= 0 && j >= 0 && i < m && j < n && !visited[i][j]){
                        if(A[i][j] == 1)
                            return count;
                        visited[i][j] = true;
                        q.offer(new int[]{i,j});
                    }
                }
            }
            count++;            
        }
        return -1;
    }
    public void dfs(int[][] A, boolean[][] visited, Queue<int[]> q, int i, int j, int[][] dirs){
        if(i < 0 ||j < 0 ||i >= A.length || j >= A[0].length || visited[i][j] || A[i][j] == 0)
            return;
        visited[i][j] = true;
        q.offer(new int[]{i,j});
        for(int[] dir: dirs){
            dfs(A,visited,q,i+dir[0],j+dir[1],dirs);
        }
    }
}