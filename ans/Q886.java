class Solution {
    public boolean possibleBipartition(int N, int[][] dislikes) {
        boolean[][] graph = new boolean[N][N];
        for(int[] g : dislikes){
            graph[g[0]-1][g[1]-1] = true;
            graph[g[1]-1][g[0]-1] = true;
        }
        int[] group = new int[N];
        for(int i = 0; i < N; i++){
            if(group[i] == 0 && !dfs(i,graph,group,1))
                return false;
        }
        return true;
    }
    public boolean dfs(int index,boolean[][] graph, int[]group, int color){
        if(group[index]!= 0)
            return group[index] == color;
        group[index] = color;
        for(int i = 0; i < group.length; i++){
            if(graph[index][i] && !dfs(i,graph,group,0-color))
                return false;
        }
        return true;
    }
}