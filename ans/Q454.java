class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : A){
            for(int j : B){
                int sum = i + j;
                map.put(sum,map.getOrDefault(sum,0) + 1);
            }
        }
        int res = 0;
        for(int i : C){
            for(int j : D){
                int temp = i+j;
                res += map.getOrDefault(-temp,0);
            }
        }
        return res;
    }
}