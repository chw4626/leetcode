class Solution {
    public int superPow(int a, int[] b) {
        int res = 1;
        int p = a;
        for(int i = b.length - 1; i >=0; i--){
            res = res * pow(p,b[i],1337)%1337;
            p = pow(p, 10,1337);
        }
        return res;
    }
    public int pow(int a, int b, int c) {
        long res = 1;
        long p = a;
        while (b > 0) {
            if ((b & 1) == 1) { 
                res = (res * p) % c;
            }
            p = (p * p) % c;
            b >>= 1;
        }
        return (int)(res % c);
    }
}