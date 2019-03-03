class Solution {
    public int lenLongestFibSubseq(int[] A) {
        int n = A.length;
        int res = 0;
        if(n < 3) return res;
        int[][] dp = new int[n][n];
        for(int i = 1; i < n; i++){
            int target = A[i];
            int l = 0, r = i - 1;
            while(l < r){
                int sum = A[l] + A[r];
                if(sum < target)
                    l++;
                if(sum > target)
                    r--;
                if(sum == target){
                    dp[r][i] = dp[l][r] + 1;
                    res = Math.max(res,dp[r][i]);
                    l++;
                    r--;
                }
            }
        }
        return res == 0 ? 0 : res + 2;
    }
}