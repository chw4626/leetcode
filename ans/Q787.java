class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        Map<Integer,Map<Integer,Integer>> price = new HashMap<>();
        for(int[] f : flights){
            if(!price.containsKey(f[0]))
                price.put(f[0], new HashMap<>());
            price.get(f[0]).put(f[1],f[2]);
        }
        Queue<int[]> pq = new PriorityQueue<>((a, b) -> (Integer.compare(a[0], b[0])));
        pq.add(new int[]{0,src,K+1});
        while(!pq.isEmpty()){
            int[] top = pq.remove();
            int pri = top[0];
            int city = top[1];
            int stop = top[2];
            if(city == dst)
                return pri;
            if(stop > 0){
                Map<Integer,Integer> adj = price.getOrDefault(city, new HashMap<>());
                for(int a : adj.keySet()){
                    pq.add(new int[] {pri + adj.get(a), a, stop-1});
                }
            }
        }
        return -1;
    }
}