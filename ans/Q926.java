class Solution {
    public int minFlipsMonoIncr(String S) {
        int min = 0;
        for(char c : S.toCharArray()){
            if(c == '1')
                min++;
        }
        int countone = 0;
        int countzero = S.length() - min;
        for(char c : S.toCharArray()){
            if(c == '1'){
                if(countone + countzero < min)
                    min = countone + countzero;
                countone++;
            }
            if(c == '0')
                countzero--;
        }
        return min;
    }
}