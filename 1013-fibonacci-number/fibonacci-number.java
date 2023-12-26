class Solution {
    public int fib(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return ans(n,dp);
    }
    public int ans(int n,int[] dp){
         if(n == 0 || n == 1) return n;
         if(dp[n] != -1) return dp[n];
         int temp = fib(n-1);
         int temp2 = fib(n-2);
         dp[n] = temp+temp2;
         return dp[n];
    }
}