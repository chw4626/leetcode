class Solution {
    public List<Integer> partitionLabels(String S) {
        int lastindex[] = new int[26];
        for(int i = 0; i < S.length(); i++)
            lastindex[S.charAt(i)-'a'] = i;
        List<Integer> res = new ArrayList<Integer>();
        int start = -1;
        int end = 0;
        for(int i = 0; i < S.length(); i++){
            end = Math.max(end, lastindex[S.charAt(i) - 'a']);
            if(end == i){
                res.add(end - start);
                start = end;
            }
        }
        return res;
    }
}