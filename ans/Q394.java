class Solution {
    public String decodeString(String s) {
        Stack<String> sc = new Stack<>();
        Stack<Integer> sn = new Stack<>();
        String res = "";
        int index = 0;
        while(index<s.length()){
            if (Character.isDigit(s.charAt(index))) {
                int count = 0;
                while (Character.isDigit(s.charAt(index))) {
                    count = 10 * count + (s.charAt(index) - '0');
                    index++;
                }
                sn.push(count);
            }
            else if (s.charAt(index) == '['){
                sc.push(res);
                res = "";
                index++;
            }
            else if(s.charAt(index)==']'){       
                /*StringBuilder temp = new StringBuilder (sc.pop());
                int repeatTimes = sn.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    temp.append(res);
                }
                res = temp.toString();
                index++;*/

                int t =  sn.pop();
                String ts = new String(res);
                res = sc.pop();
                for(int i =0; i < t;i++){
                    res += ts;
                }           
                index++;
            }
            else{
                res += s.charAt(index);
                index++;
            }
        }
        return res;        
    }
}