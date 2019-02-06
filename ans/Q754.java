class Solution {
    public int reachNumber(int target) {
        int i = 0;
        int sum = 0;
        int pt = Math.abs(target);
        while(sum < pt){
            i++;
            sum += i;
        }
        while((sum - target) % 2 != 0){
            i++;
            sum += i;
        }
        return i;
    }
}