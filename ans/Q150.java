class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> deque = new LinkedList<>();
        for(String s : tokens){
            if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")){
                int right = deque.pollFirst();
                int left = deque.pollFirst();
                if(s.equals("+"))
                    deque.addFirst(left+right);
                if(s.equals("-"))
                    deque.addFirst(left-right);
                if(s.equals("*"))
                    deque.addFirst(left*right);
                if(s.equals("/"))
                    deque.addFirst(left/right); 
            }
            else{
                deque.addFirst(Integer.parseInt(s));
            }
        }
        return deque.peekFirst();
    }
}