class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num <= 1) return false;
        long d = num;
        while((d*d) > num){
            d = (d+num/d)/2;
        }
        List<Integer> res = new ArrayList<Integer>();
        res.add(1);
        for(int i = 2; i <= d; i++){
            if(num%i == 0){
                res.add(i);
                res.add(num/i);
            }
        }
        int sum = 0;
        for(int i = 0; i < res.size(); i++){
            //System.out.print(res.get(i)+" ");
            sum += res.get(i);
        }
        return sum == num;
    }
}