class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int len = s.length();
        List<String> res = new ArrayList<String>();
        if(len <= 10)
            return res;
        
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        //List<String> res = new ArrayList<String>();
        for(int i = 0;i <= len-10; i++ ){
            String temp = s.substring(i, i+10);
            if(map.containsKey(temp)&&map.get(temp) < 2){
                res.add(temp);
                int t = map.get(temp) + 1;
                map.put(temp,t);
            }
            else if(map.containsKey(temp)&&map.get(temp) >= 2)
                continue;
            else
                map.put(temp,1);
        }
        return res;
    }
}