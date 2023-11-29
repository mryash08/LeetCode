class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int start = matrix[0][0];
        int end = matrix[matrix.length-1][matrix.length-1];
        int mid = 0;
        while(start < end){
              mid = start + (end-start)/2;
              int count = posEle(matrix,mid);
              if(count < k){
                  start = mid+1;
              }else{
                  end = mid;
              }
        }
        return start;
    }
    public int posEle(int[][] mat ,int mid){
            int i=mat.length-1; int j=0; int count = 0;
            while(i>=0 && j<mat.length){
                if(mid < mat[i][j]){
                     i--;
                }else{
                    j++;
                    count += i+1; 
                }
           }
       return count;
    }
    
}