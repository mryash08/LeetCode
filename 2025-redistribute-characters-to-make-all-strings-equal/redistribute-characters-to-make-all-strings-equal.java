class Solution {
    public boolean makeEqual(String[] words) {
        int[] freq=new int[27];
        for(int i=0; i<words.length; i++){
            for(int j=0; j<words[i].length(); j++){
                freq[words[i].charAt(j)-'a']++;
            }
        }
        for(int i=0; i<freq.length; i++){
            if(freq[i] % words.length != 0){
                  return false;
            }
        }
        return true;
    }
}