class Solution {
    public long countVowels(String word) {
         long ans = 0;
         byte[] arr = word.getBytes();

         for(int i=0; i<(long)word.length(); i++){
              if(arr[i] == 'a' || arr[i] == 'e'|| arr[i] == 'i'||arr[i] == 'o'||arr[i] == 'u'){
                  ans += (i+1) * ((long)word.length() - i);
              }
         }
         return ans;
    }
}