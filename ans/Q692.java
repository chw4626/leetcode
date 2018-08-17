class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        List<String> res = new ArrayList<String>();
        for(int i=0; i<words.length; i++)
        {
            if(map.containsKey(words[i]))
                map.put(words[i], map.get(words[i])+1);
            else
                map.put(words[i], 1);
        }
        PriorityQueue<Map.Entry<String,Integer>> maxHeap = new PriorityQueue<>(k, (a,b) -> 
            a.getValue()==b.getValue() ? a.getKey().compareTo(b.getKey()) : b.getValue()-a.getValue()); 
        
        for( Map.Entry<String,Integer> entry: map.entrySet()){
            maxHeap.add(entry);
        }
        while(res.size()<k) res.add(maxHeap.poll().getKey());
        return res;
    }
}x