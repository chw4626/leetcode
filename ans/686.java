class Solution {
    public int repeatedStringMatch(String A, String B) {
        int count = 1;
        StringBuilder sb = new StringBuilder();
        sb.append(A);
        while(!sb.toString().contains(B)){
            if(sb.length() > A.length() + B.length())
                return -1;
            count++;
            sb.append(A);
        }
        return count;
    }
}