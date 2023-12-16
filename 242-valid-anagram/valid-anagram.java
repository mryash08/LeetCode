class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        int[] counter = new int[26];
        for(int idx = 0; idx < s.length(); idx++){
            counter[sc[idx]-'a']++;
            counter[tc[idx]-'a']--;
        }
        for(int idx: counter){
            if(idx != 0)
                return false;
        }
        return true;
    }
}