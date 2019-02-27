class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        if(words == null || s.length() == 0 || words.length == 0) return res;
        int wordlen = words[0].length();
        int wordnum = words.length;
        int stringlen = s.length();
        int slidesize = wordlen * wordnum;
        HashMap<String, Integer> map = new HashMap<>();
        for(String str : words){
            map.put(str,map.getOrDefault(str,0) + 1);
        }
        
        for(int i = 0; i < wordlen; i++){
            Map<String, Integer> curmap = new HashMap<>();
            int start = i;
            int count = 0;
            for(int j = i; j + wordlen <= stringlen;j += wordlen){
                if(start + slidesize > stringlen)
                    break;
                String word = s.substring(j, j + wordlen);
                if(!map.containsKey(word)){
                    start = j + wordlen;
                    curmap.clear();
                    count = 0;
                }
                else{
                    if(j - start == slidesize){
                        String rmword = s.substring(start,start + wordlen);
                        start += wordlen;
                        int val = curmap.get(rmword);
                        if(val == 1)
                            curmap.remove(rmword);
                        else curmap.put(rmword,val - 1);
                        if(val - 1 < map.get(rmword))
                            count--;                     
                    }
                    curmap.put(word,curmap.getOrDefault(word,0) + 1);
                    if(map.get(word) >= curmap.get(word)){
                        count++;
                    }
                    if(count == wordnum && start + slidesize == j + wordlen){
                        res.add(start);
                    }
                }
            }
        }
        return res;
    }
}