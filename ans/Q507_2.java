class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num <= 1) return false;
        long d = num;
        while((d*d) > num){
            d = (d+num/d)/2;
        }
        int sum = 1;
        for(int i = 2; i <= d; i++){
            if(num%i == 0){
                sum = sum + i + num/i;
            }
        }
        return sum == num;
    }
}