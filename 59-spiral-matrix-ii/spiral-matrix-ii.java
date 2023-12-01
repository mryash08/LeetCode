class Solution {
    public int[][] generateMatrix(int A) {
        int[][] ans = new int[A][A];
          int val = 1;
          int n = A;
          int count = 0;
        int i=0; int j=0;
          while(val <= A*A-1){
                count = 0;
                while(count != n-1){
                    ans[i][j++] = val++;
                    count++;
                }
              count = 0;
               while(count != n-1){
                  ans[i++][j] = val++;
                   count++;
               }
              count = 0;
              while(count != n-1){
                  ans[i][j--] = val++;
                  count++;
              }
              count = 0;
              while(count != n-1){
                  ans[i--][j] = val++;
                  count++;
              }
              n-=2;
              i+=1;
              j+=1;
          }
          if(ans[i][j] == 0) ans[i][j] = val;
          return ans;
    }
}