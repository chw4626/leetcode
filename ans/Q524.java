class Solution {
    public String findLongestWord(String s, List<String> d) {
        String res = "";
        if (s.length() == 0 || d.size() == 0) {
            return res;
        }
        for (String str : d) {
            int resLen = res.length();
            int strLen = str.length();
            if (isSequence(s, str) &&
                (strLen > resLen || (strLen == resLen && str.compareTo(res) < 0))) {
                res = str;
            }
        }
        return res;
    }
    
    private boolean isSequence(String s, String d) {
        int i = 0;
        int j = 0;
        while (i < s.length() && j < d.length()) {
            if(s.charAt(i) == d.charAt(j))
                j++;
            i++;
        }
        return j == d.length();
    }
}