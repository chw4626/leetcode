class Solution {
    public int romanToInt(String s) {
        String roman = "MDCLXVI";
        int [] number = {1000,500,100,50,10,5,1};
        int res = 0;
        int lst = 0;
        if(s.length()>1){
        for(int i =0; i < s.length()-1;i++){
            
            int j = i+1;
            int n1 = roman.indexOf(s.charAt(i));
            int n2 = roman.indexOf(s.charAt(j));
            lst = n2;
            if(number[n1]<number[n2])
                res -= number[n1];
            else
                res += number[n1];
            }            
        }
        else 
            lst = roman.indexOf(s.charAt(0));
        return res + number[lst];
    }
}