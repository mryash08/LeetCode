class Solution {
    
    public int minFallingPathSum(int[][] matrix) {
        int ans = Integer.MAX_VALUE;
        int[][] dp = new int[matrix.length][matrix[0].length];
        for(int i=0; i<dp.length; i++){
            Arrays.fill(dp[i],-101);
        }
        for(int i=0; i<matrix[0].length; i++){
            ans = Math.min(ans,Helper(matrix,0,i,dp));
        }
        return ans;
    }
    public int Helper(int[][] matrix,int x,int y,int[][] dp){
        if(dp[x][y] != -101) return dp[x][y];
        int ans = 10001;
        if(x != matrix.length-1 && y != 0){
            ans = Math.min(ans,matrix[x][y] + Helper(matrix,x+1,y-1,dp));
        }
        if(x != matrix.length-1){
            ans = Math.min(ans,matrix[x][y] + Helper(matrix,x+1,y,dp));
        }
        if(x != matrix.length-1 && y != matrix[0].length-1){
            ans = Math.min(ans, matrix[x][y] + Helper(matrix,x+1,y+1,dp));
        }
        if(ans == 10001){
            dp[x][y] = matrix[x][y];
            return matrix[x][y];
        }

        dp[x][y] = ans;
        return ans;
    }
}