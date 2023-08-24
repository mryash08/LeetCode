class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        if(r * c != mat.length * mat[0].length) return mat;

        int[][] ans = new int[r][c];

        int r1 = 0; int c1 =0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                  ans[r1][c1++] = mat[i][j];
                  if(c1 > c-1){
                      c1 = 0;
                      r1++;
                  }

            }
        }
        
        return ans;
    }
}