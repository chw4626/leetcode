class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<Integer>();
        for(int i = left; i <= right; i++){
            int len = String.valueOf(i).length();
            boolean flag = true;
            int copy = i;
            for(int j = 0; j < len; j++){
                
                if(copy%10==0)
                    flag = false;
                else if(i%(copy%10)!=0)
                    flag =false;
                copy /= 10;
            }
            if(flag)
                res.add(i);
        }
        return res;
    }
}