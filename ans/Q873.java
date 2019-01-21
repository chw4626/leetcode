class Solution {
    public int lenLongestFibSubseq(int[] A) {
        Map<Integer,Integer> map = new HashMap<>();
        int n = A.length;
        for(int i = 0; i < n; i++){
            map.put(A[i],i);
        }
        int[][] dp = new int[n][n];
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                dp[i][j] = 2;
            }
        }
        for(int j = 0; j < n - 1; j++){
            for(int k = j + 1; k < n; k++){
                int ai = A[k] - A[j];
                if(ai >= A[j])
                    continue;
                if(map.containsKey(ai)){
                    dp[j][k] = dp[map.get(ai)][j] + 1;
                }
            }
        }
        int count = 0;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                count = Math.max(count,dp[i][j]);
            }
        }
        return count == 2 ? 0 : count;
    }
}