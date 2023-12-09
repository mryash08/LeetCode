class Solution {
    public int maxSum(int[][] grid) {
        for(int i=0; i<grid.length; i++){
            for(int j=1; j<grid[0].length; j++){
                grid[i][j] += grid[i][j-1];
            }
        }
        int ans = 0;
        for(int i=2; i<grid.length; i++){
            for(int j=2; j<grid[0].length; j++){
                 int sum = 0;
                  if(j == 2){
                        sum = grid[i][j] + grid[i-2][j];
                        sum += grid[i-1][j-1] - grid[i-1][j-2];
                  }else{
                       sum += (grid[i][j] - grid[i][j-3]) ;
                       sum += (grid[i-2][j] - grid[i-2][j-3]);
                       sum += (grid[i-1][j-1] - grid[i-1][j-2]);
                  }
                  ans = Math.max(sum,ans);
            }
        }
        return ans;
    }
}