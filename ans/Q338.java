class Solution {
    public int[] countBits(int num) {
        int[] res = new int[num+1];
        int deposit = 1;
        for (int i = 1 ;i<num+1;i++){
            if(i==deposit*2){
                deposit*=2;
            }
            res[i] = res[i-deposit]+1;
        }
        return res;
    }
}