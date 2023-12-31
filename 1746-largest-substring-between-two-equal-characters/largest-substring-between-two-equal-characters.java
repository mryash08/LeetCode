class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] freq = new int[27];
        Arrays.fill(freq,-1);
        int ans = -1;
        for(int i=0; i<s.length(); i++){
            int t = s.charAt(i)-'a';
            if(freq[t] != -1){
                ans = Math.max(ans,i-freq[t]-1);
            }else{
                freq[t] = i;
            }
        }
        return ans;
    }
}