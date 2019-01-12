class Solution {
    public int numSpecialEquivGroups(String[] A) {
        Set<String> res = new HashSet<String>();
        for(String a : A){
            int[] odd = new int[26];
            int[] even = new int[26];
            for(int i =0; i < a.length(); i++){
                if(i%2==1)
                    odd[a.charAt(i)-'a']++;
                else
                    even[a.charAt(i)-'a']++;
            }
            String tep = Arrays.toString(odd)+Arrays.toString(even);
            res.add(tep);
        }
        return res.size();
    }
}