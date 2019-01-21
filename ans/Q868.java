class Solution {
    public int binaryGap(int N) {
        String n = Integer.toBinaryString(N);
        int res = 0;
        int curr = -1;
        for(int i = 0; i < n.length(); i++){
            if(n.charAt(i) - '0' == 1){
                if(curr != -1)
                    res = Math.max(res,i - curr);
                curr = i;
            }
        }
        return res;
    }
}