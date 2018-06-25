class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> ans = new ArrayList<String>();
        if(s.length() < 4 || s.length() > 12)
            return ans;
        recursive(ans,0,s,"");
        return ans;
    }
    
    public void recursive(List<String> ans, int s, String str, String tmp){
        if(s == 3 && check(str)){
            ans.add(new String(tmp+str));
            return;
        }
        for(int i=0; i<3 && i<str.length()-1; i++){
            String substr = str.substring(0,i+1);
            if(check(substr)){
                recursive(ans,s+1,str.substring(i+1,str.length()),tmp+substr+".");
            }
        }
    }
    
    public boolean check(String substr){
        if(substr.charAt(0) == '0')
            return "0".equals(substr);
        int num = Integer.parseInt(substr);
        if(num > 255 || num < 1) return false;
        return true;
    }
}