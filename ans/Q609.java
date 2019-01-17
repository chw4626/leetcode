class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> res = new ArrayList<>();
        Map<String,Set<String>> map = new HashMap<>();
        int n = paths.length;
        if(n == 0) return res;
        for(String path : paths){
            String[] str = path.split("\\s+");
            for(int i = 1; i < str.length; i++){
                int idx = str[i].indexOf('(');
                String content = str[i].substring(idx);
                String file = str[0] + "/" + str[i].substring(0,idx);
                Set<String> files = map.getOrDefault(content,new HashSet<String>());
                files.add(file);
                map.put(content,files);
            }
        }
        for(String key : map.keySet()){
            if(map.get(key).size() > 1)
                res.add(new ArrayList<String>(map.get(key)));
        }
        return res;
    }
}