class Solution {
    public boolean isAnagram(String s, String t) {
        char [] sc = s.toCharArray();
        char [] tc = t.toCharArray();
        int ns[] = new int[26];
        for (int i = 0 ;i < sc.length; i++)
            ns[sc[i] - 'a']++;
        for (int i = 0; i < tc.length; i++)
            ns[tc[i] - 'a']--;
        for(int i = 0; i < 26; i++)
            if(ns[i] != 0)
                return false;
        return true;
    }
}