class Solution {
    public int numSquares(int n) {
         int[] dp = new int[n+1];
         Arrays.fill(dp,-1);
         return numHelper(n,dp);
    }
    public static int numHelper(int n,int[] dp){
        if(dp[n] != -1) return dp[n];
        if(n == 0) return 0;
        if(n < 0) return Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;
        for(int i=1; i*i<=n; i++){
           ans = Math.min(ans, numHelper(n-(i*i),dp));
        }
        if(ans != Integer.MAX_VALUE){
            dp[n] = ans+1;
            return ans+1;
        }
        dp[n] = ans;
        return ans;
    }
}