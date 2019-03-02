class Solution {
    public int[][] kClosest(int[][] points, int K) {
        int[][] res = new int[K][2];
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(
            (p1,p2) -> p1[0]*p1[0] + p1[1]*p1[1] - p2[0]*p2[0] - p2[1]*p2[1]
        );
        for(int[] num: points){
            pq.offer(num);
        }
        
        for(int i = 0; i < K; i++){
            res[i] = pq.poll();
        }
        return res;
    }
}