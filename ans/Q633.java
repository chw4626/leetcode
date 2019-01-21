class Solution {
    public boolean judgeSquareSum(int c) {
        if(c < 0) return false;
        int left = 0, right = (int)Math.sqrt(c);
        while(left <= right){
            int sum = left * left + right * right;
            if(sum == c)
                return true;
            if(sum < c)
                left++;
            if(sum > c)
                right--;
        }
        return false;
    }
}