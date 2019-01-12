class Solution {
    public boolean buddyStrings(String a, String b) {
        if(a.length()!=b.length())
            return false;
        
        if(a.equals(b)){
            Set<Character> set = new HashSet<>();
            for(char c : a.toCharArray()){
                set.add(c);
            }
            return a.length() > set.size();
        }
        
        List<Integer> res = new ArrayList<Integer>();    
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i)!=b.charAt(i)){
                res.add(i);
            }
        }
        if(res.size()==2&&a.charAt(res.get(0)) == b.charAt(res.get(1))&&b.charAt(res.get(0)) == a.charAt(res.get(1)))
            return true;
        return false;
    }
}