class Solution {
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
         long[][][] dp = new long[m+1][n+1][maxMove+1];
         for(int i=0; i<m; i++){
             for(int j=0; j<n; j++){
                 Arrays.fill(dp[i][j],-1);
             }
         }
         return (int)((findPathsHelper(m,n,maxMove,startRow,startColumn,dp)) % 1000000007);
    }

    public static long findPathsHelper(int m, int n, int move, int row, int col,long[][][] dp){
        if(row >= m || col >= n || row < 0 || col < 0){
            return 1;
        }
        if(dp[row][col][move] != -1) return dp[row][col][move];
        long a = 0,b=0,c=0,d=0;
        if(move != 0){
            a =  findPathsHelper(m,n,move-1,row+1,col,dp);
            b =  findPathsHelper(m,n,move-1,row-1,col,dp);
            c =  findPathsHelper(m,n,move-1,row,col+1,dp);
            d =  findPathsHelper(m,n,move-1,row,col-1,dp);
        }
        return dp[row][col][move] = (a+b+c+d) % 1000000007;
    }
}