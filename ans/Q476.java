class Solution {
    public int findComplement(int num) {
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(num));
        boolean flag = false;
        for(int i = 0; i < sb.length(); i++){
            if(sb.charAt(i) == '1'){
                flag = true;
            }
            if(flag){
                if(sb.charAt(i) == '1') sb.setCharAt(i,'0');
                else sb.setCharAt(i,'1');
            }
        }
        return Integer.valueOf(sb.toString(),2);
    }
}