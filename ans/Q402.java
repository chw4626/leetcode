class Solution {
    public String removeKdigits(String num, int k) {
        if(k==num.length())        
            return "0";
        
        for(int i = 0; i < num.length(); i++){
                while(k>0 && !stack.isEmpty() && stack.peek() > (num.charAt(i) - '0')){
                    k--;
                    stack.pop();
                }
            stack.push(num.charAt(i) - '0');
        }
        
        while(k>0){
            stack.pop();
            k--;            
        }
        
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty())
            sb.append(stack.pop());
        sb.reverse();
        
        while(sb.length()>1 && sb.charAt(0)=='0')
            sb.deleteCharAt(0);
        return sb.toString();
    }
}