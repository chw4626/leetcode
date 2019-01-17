class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sum1 = 0;
        Set<Integer> set = new HashSet<>();
        for(int a : A){
            sum1 += a;
            set.add(a);
        }
        int sum2 = 0;
        for(int b : B)
            sum2 += b;
        int avg = (sum1+sum2)/2;
        //int[] res = new int[2];
        for(int b : B){
            if(set.contains(sum1 + b - avg)){
                    return new int[] {sum1 + b -avg, b};
                }
        }
        return null;
    }
}