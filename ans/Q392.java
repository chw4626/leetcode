class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        int index = 0;
        for(char ch : t.toCharArray()){
            if(ch == s.charAt(index)){
                index ++;
                if(index == s.length())
                    return true;
            }
        }
        return false;
    }
}