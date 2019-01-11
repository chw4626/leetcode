class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int flag = 0;
        for(int i = num1.length()-1, j = num2.length()-1; i>=0 || j>=0 || flag>0; i--,j--){
            int x = i < 0 ? 0 : num1.charAt(i) - '0';
            int y = j < 0 ? 0 : num2.charAt(j) - '0';
            sb.append((x+y+flag)%10);
            flag = (x+y+flag)/10;
        }
        return sb.reverse().toString();
    }
}