class Solution {
    public int countPrimeSetBits(int L, int R) {
        int count = 0;
        for(int i = L; i <= R; i++){
            if(isprime(Integer.bitCount(i)))
                count++;       
        }
        return count;
    }
    public boolean isprime(int num){
        if(num == 2 || num == 3 || num == 5 || num == 7 || num == 11 || num == 13 || num == 17 || num == 19)
            return true;
        return false;
    }
}