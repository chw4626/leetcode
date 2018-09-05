class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
       String[] splitArr = paragraph.toLowerCase().replaceAll("[^a-z]"," ").split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        List<String> bannedList = Arrays.asList(banned);
        for(String str: splitArr) {
            if(!bannedList.contains(str)) {
                map.put(str, map.getOrDefault(str, 0) + 1);
            }
        }

        int currentMax = 0;
        String res = "";
        for(String key: map.keySet()) {
            res = map.get(key) >  currentMax ? key : res;
            currentMax = map.get(key);
        }
        return res; 
    }
}