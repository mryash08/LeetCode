class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] freq = new int[27];
        for(int i=0; i<chars.length(); i++){
            freq[chars.charAt(i)-'a']++;
        }
        int ans = 0;
        for(int i=0; i<words.length; i++){
            int[] freq1 = new int[27];
            for(int k=0; k<freq.length; k++){
                freq1[k] = freq[k];
            }
                boolean flag = false;
            for(int j=0; j<words[i].length(); j++){
                freq1[words[i].charAt(j)-'a']--;
                if(freq1[words[i].charAt(j)-'a'] < 0){
                    flag = true;
                    break;
                }
               
            }
             if(!flag){
                  ans += words[i].length();
                }
        }
        return ans;
    }
}