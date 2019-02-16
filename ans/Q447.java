class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int[] i : points){
            for(int[] j : points){
                if(i == j) continue;
                int t = (i[0] - j[0])*(i[0] - j[0]) + (i[1] - j[1])*(i[1] - j[1]);
                
                count += map.getOrDefault(t,0) * 2;
                map.put(t,map.getOrDefault(t,0)+ 1);
            }
            map.clear();
        }
        return count;
    }
}