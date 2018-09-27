class Solution {
    public int longestSubstring(String s, int k) {
        char[] str = s.toCharArray();
        return helper(str,k,0,s.length());
    }
    public int helper(char[] str, int k, int start, int end){
        if(end - start <k) return 0;
        int[] count = new int[26];
        for(int i = start; i < end; i++){
            int idx = str[i] -'a';
            count[idx]++;
        }
        for(int i =0; i < 26; i++){
            if(count[i]>0 && count[i]<k){
                for(int j = start; j < end; j++){
                    if(str[j] == 'a'+i){
                        int left = helper(str,k,start,j);
                        int right = helper(str,k,j+1,end);
                        return Math.max(left, right);
                    }
                }
            }
        }
        return end - start;
    }
}