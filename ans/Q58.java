class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length()==0){
            return 0;
        }
        else{
        String[] s2 = s.split(" ");
            if(s2.length>=1){
            return s2[s2.length-1].length();
            }
            else return 0;
        }
    }
}