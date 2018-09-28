class Solution {
    public int findSubstringInWraproundString(String p) {
        int[] a = new int[26];
        int max = 0;
        for(int i = 0; i < p.length(); i++){
            if(i> 0 &&((p.charAt(i)- p.charAt(i-1) ==1) || (p.charAt(i-1)- p.charAt(i)==25))){
                max++;
            }
            else
                max = 1;
            a[p.charAt(i)-'a'] = Math.max(max, a[p.charAt(i) - 'a']);
        }
        int sum = 0;
        for(int i = 0; i < 26; i++)
            sum += a[i];
        return sum;
    }
}