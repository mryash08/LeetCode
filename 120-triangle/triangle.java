class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()][triangle.get(triangle.size()-1).size()];
        for(int i=0; i<dp.length; i++){
            Arrays.fill(dp[i],-1);
        }
        return minimumHelper(triangle,0,0,dp);
    }
    public int minimumHelper(List<List<Integer>> triangle,int x,int y,int[][] dp){
        if(x == triangle.size()){
            return 0;
        }
        if(dp[x][y] != -1) return dp[x][y];
       int left =  minimumHelper(triangle,x+1,y,dp);
        int right = minimumHelper(triangle,x+1,y+1,dp);
        dp[x][y] = Math.min(triangle.get(x).get(y) + left, triangle.get(x).get(y) + right);
        return dp[x][y];
    }

}