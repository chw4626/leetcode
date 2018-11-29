public class Solution {
    /**
     * @param stringIn: The original string.
     * @param K: The length of substrings.
     * @return: return the count of substring of length K and exactly K distinct characters.
     */
    public int KSubstring(String s, int k) {
        // Write your code here
        //int count = 0;
        /*Set<String> sub = new HashSet<String>();
        Set<Character> t = new HashSet<Character>();
        if(stringIn.length()<k) return 0;
        int start = 0;
        for(int i =0; i <= stringIn.length()-k; i++){
            while(t.contains(stringIn.charAt(i))){
                t.remove(stringIn.charAt(start));
                start++;
            }
            t.add(stringIn.charAt(i));
            if(t.size()==k){
                sub.add(stringIn.substring(i,i+k));
                //i = i + k;
                t.remove(stringIn.charAt(start));
                start++;
            }
        }
        return sub.size();*/
        Set<Character> set = new HashSet<>();
        Set<String> dedup = new HashSet<>();
        int count = 0, start = 0;
        for(int i = 0; i < s.length(); i++) {
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(s.charAt(i));
            
            
            if(set.size() == k) {
                String sub = s.substring(start, start + k);
                dedup.add(sub);
                set.remove(s.charAt(start));
                start++;
            }
        }
        return dedup.size();
    }
}