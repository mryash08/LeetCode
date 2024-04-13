class Solution {
    public int maximalRectangle(char[][] matrix) {
        int[] h = new int[matrix[0].length];
        int ans = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == '1') 
                    h[j] += 1;
                else 
                    h[j] = 0;
            }
            ans = Math.max(ans, largestRectangleArea(h));
        }
        return ans;
    }
    public int largestRectangleArea(int[] heights) {
        
        return nextSmallerElements(heights, prevSmallerElements(heights));
    }
    int[] prevSmallerElements(int[] h) {
        int[] arr = new int[h.length];
        arr[0] = -1;
        for(int i = 1; i < h.length; i++) {
            int idx = i - 1;
            while(idx >= 0 && h[idx] >= h[i]) {
                idx = arr[idx];
            }
            arr[i] = idx;
        }
        return arr;
    }
    int nextSmallerElements(int[] h, int[] ps) {
        int ans = 0, n = h.length;
        int[] arr = new int[n];
        
        arr[n - 1] = n;
        ans = Math.max(ans,(arr[n - 1] - ps[n - 1] - 1) * h[n-1]);
        for(int i = n - 2; i >= 0; i--) {
            int idx = i + 1;
            while(idx < n && h[idx] >= h[i]) {
                idx = arr[idx];
            }
            arr[i] = idx;
            ans = Math.max(ans,(arr[i] - ps[i] - 1) * h[i]);
        }

        return ans;
    }
}