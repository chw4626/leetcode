class Solution {
    public boolean isHappy(int n) {
        if(n == 1) return true;
        int res = n;
        Set<Integer> intSet = new HashSet<>();
        while(res!=1){
         int curr = 0;
        while(res!= 0){
            curr += (res%10)*(res%10);
            res = res / 10;
        }
            res = curr;
            if(intSet.contains(res)){
                return false;
            }
            else{
                intSet.add(res);
            }
        }
            return true;
    }
}