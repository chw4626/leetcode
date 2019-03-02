class Solution {
    public int minEatingSpeed(int[] piles, int H) {
        int l = 1;
        int h = Integer.MIN_VALUE;
        for (int p : piles) {
            h = Math.max(p, h);
        }
        while(l <= h){
            int k = l + (h -l) / 2; 
            if(can(k,piles,H)){
                h = k - 1;
            }
            else{
                l = k + 1;
            }
        }
        return l;
    }
    public boolean can(int k, int[] p, int h){
        int count = 0;
        for(int i : p){
            count += i/k;
            if(i % k != 0)
                count++;
        }
        return count <= h;
    }
}