class Solution {
    public int rotatedDigits(int N) {
        int count = 0;
        for(int i = 1; i <= N; i++){
            if(isr(i))
                count++;
        }
        return count;
    }
    public boolean isr(int n){
        boolean flag = false;
        while(n > 0){
            if(n%10 == 2) flag = true;
            if(n%10 == 5) flag = true;
            if(n%10 == 6) flag = true;
            if(n%10 == 9) flag = true;
            if(n%10 == 3) return false;
            if(n%10 == 4) return false;
            if(n%10 == 7) return false;
            n = n/10;
        }
        return flag;
    }
}