class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] a = new boolean[s.length()+1];
        a[0] = true;
        for(int i = 1; i <= s.length(); i++){
            for(int j = 0; j<i; j++){
                if(a[j]&& wordDict.contains(s.substring(j,i))){
                    a[i] = true;
                    break; 
                }       
            }
        }
        return a[s.length()];
    }
}