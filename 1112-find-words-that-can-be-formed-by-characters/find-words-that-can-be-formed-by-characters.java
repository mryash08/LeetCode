class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] freq = new int[27];
        char[] arr = chars.toCharArray();
        for(int i=0; i<arr.length; i++){
            freq[arr[i]-'a']++;
        }
        int ans = 0;
        for(int i=0; i<words.length; i++){
            int[] freq1 = new int[27];
            for(int k=0; k<freq.length; k++){
                freq1[k] = freq[k];
            }
                boolean flag = false;
                char[] arr1 = words[i].toCharArray();
            for(int j=0; j<arr1.length; j++){
                freq1[arr1[j]-'a']--;
                if(freq1[arr1[j]-'a'] < 0){
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