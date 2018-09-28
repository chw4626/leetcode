class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
  int count = 0;
  if(n==1)  return 1; 
  boolean[][] dp = new boolean[n][n];
    
  for (int i = 0; i < n ; i++) {
    for (int j = i; j >=0; j--) {
      dp[i][j] = s.charAt(i) == s.charAt(j) && (i - j < 3 || dp[i - 1][j + 1]);
            
      if (dp[i][j]) {
        count++;
      }
    }
  }
    
  return count;
    }
}