class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        int[][] dp = new int[n+1][target+1];
        dp[0][0] = 1;
        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                for(int a=1; a<=k; a++){
                    if(j >= a) dp[i][j] = ((dp[i][j]) + (dp[i-1][j-a]))%1000000007;
                }
            }
        }
        return dp[n][target];
    }
}