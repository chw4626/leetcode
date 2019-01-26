class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int res = 0;
        map.put(0,1);
        for(int n : nums){
            sum += n;
            if(map.containsKey(sum - k))
                res += map.get(sum -k);
                
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return res;
    }
}