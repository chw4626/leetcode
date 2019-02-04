class Solution {
    public int repeatedNTimes(int[] A) {
        Set<Integer> set = new HashSet<>();
        int res = 0;
        for(int a : A){
            if(!set.add(a)){
                res = a;
                break;
            }
        }
        return res;
    }
}