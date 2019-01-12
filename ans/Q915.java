class Solution {
    public int partitionDisjoint(int[] A) {
        int max = A[0];
        int spt = max;
        int index = 0;
        for(int i = 1; i < A.length; i++){
            max = Math.max(max,A[i]);
            if(spt>A[i]){
                spt = max;
                index = i;
            }
        }
        return index+1;
    }
}