class Solution {
    public List<String> letterCasePermutation(String S) {
        if (S == null) {
            return new LinkedList<>();
        }
        
        List<String> res = new LinkedList<>();
        helper(S,res,0);
        return res;
    }
    public void helper(String s, List<String> res, int index){
        if(index == s.length()){
            res.add(s);
            return;
        }   
        if(s.charAt(index)>='0'&&s.charAt(index)<='9'){
            helper(s,res,index+1);
        }
        else{
            char[] chs = s.toCharArray();
            chs[index] = Character.toLowerCase(chs[index]);
            helper(String.valueOf(chs),res,index+1);
            
            chs[index] = Character.toUpperCase(chs[index]);
            helper(String.valueOf(chs),res,index+1);
        }
    }
}