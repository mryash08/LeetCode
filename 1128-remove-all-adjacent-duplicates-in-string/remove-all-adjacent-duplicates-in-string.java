class Solution {
    public String removeDuplicates(String S) {
        if (S == null || S.length() <= 1) {
            return S;
        }
        char[] chars = S.toCharArray(); 
        int slow = 0; 
        
        
        for (int fast = 1; fast < S.length(); fast++) {
            if (slow >= 0 && chars[slow] == chars[fast]) {
                slow--; 
            } else { 
                chars[++slow] = chars[fast]; 
        }
        }
        return new String(chars, 0, slow + 1);
    }
}