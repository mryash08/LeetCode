class Solution {
    public int minSteps(String s, String t) {
        int[] freq = new int[26];
        char[] as = s.toCharArray();
        char[] at = t.toCharArray();
        for(char ch : as){
                freq[ch -'a']++;
        }
        for(char ch : at){
                freq[ch -'a']--;
        }
        int count = 0;
        for(int i=0; i<freq.length; i++){
            if(freq[i] < 0){
                count += freq[i] * -1;
            }
        }
        return count;
    }
}