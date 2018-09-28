class Solution {
    public String longestPalindrome(String s) {
  int n = s.length();
  String res = "";
  if(n==1)  return s; 
  boolean[][] dp = new boolean[n][n];
    
  for (int i = 1; i < n ; i++) {
    for (int j = i; j >=0; j--) {
      dp[i][j] = s.charAt(i) == s.charAt(j) && (i - j < 3 || dp[i - 1][j + 1]);
            
      if (dp[i][j] && (res == "" || i - j + 1 > res.length())) {
        res = s.substring(j, i + 1);
      }
    }
  }
    
  return res;
    }
}