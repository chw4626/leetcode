class Solution {
        private static final String[] KEYS = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    
    public List<String> letterCombinations(String digits) {
    	List<String> res = new LinkedList<String>();
        if(digits.length() == 0)
            return res;
    	helper(new StringBuilder(), digits, 0, res);
    	return res;
    }
    private void helper(StringBuilder prefix, String digits, int offset, List<String> res){
        if(offset >= digits.length()){
            res.add(new String(prefix));
            return;
        }
        String letters = KEYS[digits.charAt(offset) - '0'];
        for(int i = 0; i < letters.length(); i++){
            prefix.append(letters.charAt(i));
            helper(prefix,digits,offset+1,res);
            prefix.deleteCharAt(prefix.length()-1);
        }
        
    }
    	// private void combination(String prefix, String digits, int offset, List<String> ret) {
    	// 	if (offset >= digits.length()) {
    	// 		ret.add(prefix);
    	// 		return;
    	// 	}
    	// 	String letters = KEYS[(digits.charAt(offset) - '0')];
    	// 	for (int i = 0; i < letters.length(); i++) {
    	// 		combination(prefix + letters.charAt(i), digits, offset + 1, ret);
    	// 	}
    	// }  
}