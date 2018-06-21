class Solution {
    public List<Integer> grayCode(int n) {        
        if(n == 0){
            List<Integer> res = new ArrayList<>();
            res.add(0);
            return res;
        }
        List<Integer> res = grayCode(n-1);
        int originsize = res.size();
        int addn = 1 << (n-1);
        for(int i = originsize-1; i>=0;i--)
                res.add(res.get(i)+addn);
        return res;
    }

}