class Solution {
    public int maximalRectangle(char[][] dp) {
        int[][] matrix = new int[dp.length][dp[0].length];
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                if(dp[i][j] == '1') matrix[i][j] = 1;
                else matrix[i][j] = 0;
            }
        }
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(j != 0 && matrix[i][j] == 1) matrix[i][j] += matrix[i][j-1];
                int min = Integer.MAX_VALUE;
                for(int k = i; k>=0; k--){
                    min = Math.min(matrix[k][j],min);
                     ans = Math.max(ans,min*(i-k+1));
                } 
            }
        }
        return  ans;
    }
}