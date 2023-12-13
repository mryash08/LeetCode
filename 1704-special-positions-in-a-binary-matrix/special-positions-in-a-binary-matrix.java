class Solution {
    public int numSpecial(int[][] mat) {
        int ans = 0;
        for(int i=0; i<mat.length; i++){
            int index = -1; int count = 0;
            for(int j=0; j<mat[0].length; j++){
                if(count > 1)break;
                if(mat[i][j] == 1){
                    count++;
                    index = j; 
                }
            }
            if(count == 1){
                count = 0;
               for(int k=0; k<mat.length; k++){
                   if(mat[k][index] == 1) count++;
               }
               if(count == 1) ans++;
            }
        }
        return ans;
    }
}