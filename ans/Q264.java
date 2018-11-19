class Solution {
    public int nthUglyNumber(int n) {
        int[] res = new int[n];
        res[0] = 1;
        int factor2 = 2;
        int factor3 = 3;
        int factor5 = 5;
        int index2 = 0, index3 = 0, index5 = 0;
        for(int i = 1; i < n; i++){
            int min = Math.min(Math.min(factor2,factor3),factor5);
            res[i] = min;
            if(min == factor2){
                factor2 = 2*res[++index2]; 
            }
            if(min == factor3){
                index3++;
                factor3 = 3*res[index3];
                
            }
            if(min == factor5){
                index5++;
                factor5 = 5*res[index5];
                
            }
        }
        return res[n-1];
    }
}