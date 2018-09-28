class Solution {
    public int uniquePaths(int m, int n) {
        int[] a = new int[n];
        for(int i = 0; i< m; i++){
            for(int j =0; j < n; j++){
                if(i == 0 ||j ==0)
                    a[j] = 1;
                else
                    a[j] += a[j-1];            
            }
                        
        }
        return a[n-1];
    }
}