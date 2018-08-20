class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer>[] list = new List[nums.length + 1];
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        for(int key : map.keySet()) {
            int fq = map.get(key);
            if(list[fq] == null) {
                list[fq] = new ArrayList<>();
            }
            list[fq].add(key);
        }
        
        List<Integer> res = new ArrayList<>();
        
        for(int i = list.length - 1; i >= 0 && res.size() < k; i--) {
            if(list[i] != null) {
                res.addAll(list[i]);
            }
        }
        
        return res;
        
    }
}