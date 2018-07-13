class Solution {
    public int uniquePaths(int m, int n) {
        if(m == 1 || n == 1)
            return 1;
		
        long res = 1;
        int j = 1;
        for(int i = m; i <= m+n-2; i++, j++){      
            res *= i;
            res /= j;
        }
           
        
        return (int)res;
    }
}