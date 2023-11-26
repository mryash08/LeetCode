class Solution {
    public int largestSubmatrix(int[][] matrix) {
        for(int i=0; i<matrix[0].length; i++){
            for(int j=1; j<matrix.length; j++){
                if(matrix[j][i] == 1){
                    matrix[j][i] = matrix[j-1][i] + 1;
                }
            }
        }
        int ans = 0;
        for(int i=0; i<matrix.length; i++){
            Arrays.sort(matrix[i]);
            int k=1;
            for(int j=matrix[i].length-1; j>=0; j--){
                  ans = Math.max(matrix[i][j] * k++,ans);
                  if(matrix[i][j] == 0){
                      break;
                  }
            }
        }
        return ans;
    }
}