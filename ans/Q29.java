class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == 0) return 0;
        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        //int temp = 1;
        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;

        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);

        int res = 0;
        while(dvs<= dvd){
            // 记录除数
            long tmp = dvs;
            // 记录商的大小
            long mul = 1;
            
            while(dvd >= (tmp<<1)){
                mul<<=1;
                tmp<<=1;
            }
            dvd -= tmp;
            res += mul;
        }
        return (int)(res*sign);
    }
}