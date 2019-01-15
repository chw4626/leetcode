class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] count = new int[m+1][n+1];
        for(String s : strs){
            int z = countz(s);
            int o = counto(s);
            for(int i = m; i >= z; i--){
                for(int j = n; j >= o; j--){
                    //if(i>=z&&j>=o)
                        count[i][j] = Math.max(count[i][j],1 + count[i-z][j-o]);
                }
            }
        }
        return count[m][n];
    }
    public int countz(String s){
        int sum = 0;
        for(char a : s.toCharArray()){
            if(a == '0')
                sum++;
        }
        return sum;
    }
    public int counto(String s){
        int sum = 0;
        for(char a : s.toCharArray()){
            if(a == '1')
                sum++;
        }
        return sum;
    }
}