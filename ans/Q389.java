class Solution {
    public char findTheDifference(String s, String t) {
        int count = 0;
        for(char c : s.toCharArray()){
            count -= c - 'a';
        }
        for(char c : t.toCharArray()){
            count += c - 'a';
        }
        return (char)(count +'a');
    }
}