class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int[] freq = new int[matrix.length*matrix.length];
        int idx = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                freq[idx++] = matrix[i][j];
            }
        }
        Arrays.sort(freq);
        return freq[k-1];
    }
}