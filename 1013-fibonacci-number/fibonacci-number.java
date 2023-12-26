class Solution {
    public int fib(int n) {
        if(n == 0) return 0;
        int[] dp = new int[n+1];
        dp[1] = 1;
        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
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