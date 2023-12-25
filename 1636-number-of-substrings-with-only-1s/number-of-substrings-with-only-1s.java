class Solution {
    public int numSub(String s) {
        int count = 0; int ans = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '1'){
                count++;
            }else{
                count = 0;
            }
            ans =  (ans + count) % 1000000007;
        }
        return ans;
    }
}