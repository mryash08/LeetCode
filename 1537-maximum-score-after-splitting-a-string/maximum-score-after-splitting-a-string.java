class Solution {
    public int maxScore(String s) {
        int oneCount = 0;
        int ZeroCount = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '1') oneCount++;
        }
        if(s.charAt(0) == '0') ZeroCount++;
        else oneCount--;
        int ans = Integer.MIN_VALUE;
        for(int i=1; i<s.length(); i++){
               ans = Math.max(ans,oneCount+ZeroCount);
               if(s.charAt(i) == '0')ZeroCount++;
               else oneCount--;
        }
        return ans;
    }
}