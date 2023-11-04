class Solution {
    public int numSpecial(int[][] mat) {
        int[] row = new int[mat.length];
        int[] column = new int[mat[0].length];
        int count = 0;
        for(int i=0; i<mat.length; i++){
            count = 0;
            for(int j=0; j<mat[0].length; j++){
                  if(mat[i][j] == 1) count++;
            }
            row[i] = count;
        }

        for(int i=0; i<mat[0].length; i++){
            count = 0;
            for(int j=0; j<mat.length; j++){
                  if(mat[j][i] == 1) count++;
            }
            column[i] = count;
        }
         count = 0;
         for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                  if(mat[i][j] == 1 && row[i] == 1 && column[j] == 1) count++;
            }
        }


        return count;
    }
}