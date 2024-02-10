class Solution {
    public int countSubstrings(String s) {
         int ans = 0;
         for(int i=0; i<s.length()-1; i++){
                 ans += countHelper(s,i,i+1);
                 ans += countHelper(s,i-1,i+1);
                 ans += 1;
         }
         return ans+1;
    }

    public int countHelper(String s,int idx1,int idx2){
         int count = 0;
         while(idx1 >= 0 && idx2 < s.length()){
             if(s.charAt(idx1) == s.charAt(idx2)){
                 count++;
             }else{
                 return count;
             }
             idx1--;
             idx2++;
         }
         return count;
    }
}