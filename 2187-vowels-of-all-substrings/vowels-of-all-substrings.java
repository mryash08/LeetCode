class Solution {
    public long countVowels(String word) {
         long ans = 0;
         byte[] arr = word.getBytes();
         long n = arr.length;
         for(int i=0; i<n; i++){
              if(arr[i] == 'a' || arr[i] == 'e'|| arr[i] == 'i'||arr[i] == 'o'||arr[i] == 'u'){
                  ans += (i+1) * (n - i);
              }
         }
         return ans;
    }
}