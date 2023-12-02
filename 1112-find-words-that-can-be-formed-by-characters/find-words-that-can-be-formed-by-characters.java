class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] counts = new int[26];
        for(int i=0;i<chars.length();i++){
            counts[chars.charAt(i)-'a']++;
        }
        int res =0 ;
        for(String s : words){
            if(isValid(s,counts)) res+=s.length();
        }
        return res;
    }

    boolean isValid(String word, int[] counts){
        int[] count1 = new int[26];
        for(int i =0;i<word.length();i++){
            int x = word.charAt(i)-'a';
            count1[x]++;
            if(count1[x] > counts[x]) return false;
        }
        return true;
    }
}