class Solution {
    public int maxCount(int m, int n, int[][] ops) {

        if(ops.length == 0) return m*n;
           int minrow = ops[0][0];
           int mincolumn = ops[0][1];
           int min = 0;
           for(int i=1; i<ops.length; i++){
              if(ops[i][0] < minrow){
                  minrow = ops[i][0];
              }
              if(ops[i][1] < mincolumn){
                  mincolumn = ops[i][1];
              }
           }
        return minrow * mincolumn;
    }
}