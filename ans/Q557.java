class Solution {
    public String reverseWords(String s) {
        String[] temp = s.split(" ");
        for(int i = 0; i < temp.length; i++){
            temp[i] = new StringBuilder(temp[i]).reverse().toString();
        }
        StringBuilder res = new StringBuilder();
        for(String st : temp){
            res.append(st + " ");
        }
        return res.toString().substring(0,res.length()-1);
        
    }
}