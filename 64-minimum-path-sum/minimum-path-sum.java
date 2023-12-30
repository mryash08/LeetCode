class Solution {
     public int minPathSum(int[][] grid) {
        return  PathSumHelper(grid,new int[grid.length][grid[0].length],grid.length-1,grid[0].length-1);
    }
    public int PathSumHelper(int[][] grid,int[][] dp,int x,int y){
        int right = -1;
        int down = -1;
        if(y != 0){
             if(dp[x][y-1] != 0){
                 right = dp[x][y-1];
             }else{
                 right = PathSumHelper(grid,dp,x,y-1);
             }
        }
        if(x != 0){
            if(dp[x-1][y] != 0){
                down = dp[x-1][y];
            }else{
                down = PathSumHelper(grid,dp,x-1,y);
            }
        }
        if(right == -1 && down == -1){
            dp[x][y] = grid[x][y];
        }else  if(right == -1){
            dp[x][y] = grid[x][y]+down;
        }else if(down == -1){
            dp[x][y] = grid[x][y]+right;
        }else{
            dp[x][y] = grid[x][y]+Math.min(right,down);
        }
        return dp[x][y];
    }
}