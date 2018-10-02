class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<List<String>>();
        helper(s,res, new ArrayList<String>());
        return res;
    }
    public void helper(String s,  List<List<String>> res, List<String> temp){
        for(int i = 0; i<s.length();i++){
            if(isp(s.substring(0,i+1))){
                temp.add(s.substring(0,i+1));
                helper(s.substring(i+1),res,temp);
                temp.remove(temp.size()-1);
            }
        }
        if(s.length() == 0){
            res.add(new ArrayList(temp));
            return;
        }
    }
    public boolean isp(String str){
        int l = 0;
        int r = str.length()-1;
	        if(l==r) return true;
	        while(l<r){
	            if(str.charAt(l)!=str.charAt(r)) return false;
	            l++;r--;
	        }
	        return true;
	    }
}