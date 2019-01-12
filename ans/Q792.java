class Solution {
    public int numMatchingSubseq(String S, String[] words) {
        int count = 0;
        for(String word : words){
            int index = 0;
            for(int i = 0; i < S.length(); i++){
                if(index < word.length() && word.charAt(index) == S.charAt(i))
                    index++;
            }
            if(index == word.length())
                count++;
        }
        return count;
    }
}