class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int n = a.length;
             int m = b.length;
             if(n == 0){
                 if(m % 2 == 0){
                     return (double) ((b[m/2] + b[(m/2)-1])/2.0);
                 }else{
                     return (double) (b[m/2]);
                 }
             }
             if(n > m) return findMedianSortedArrays(b,a);

             int start = 0; int end = n;
             while(start <= end){
                 int mid1 = start + (end - start)/2;
                 int mid2 = ((n+m+1)/2) - mid1;

                 int left1 = 0; int right1=0; int left2 = 0; int right2 = 0;
                 if(mid1 > 0) left1 = a[mid1-1];
                 else  left1 = Integer.MIN_VALUE;
                 if(mid2 > 0) left2 = b[mid2-1];
                 else  left2 = Integer.MIN_VALUE;
                 if(mid1 < n) right1 = a[mid1];
                 else right1 = Integer.MAX_VALUE;
                 if(mid2 < m) right2 = b[mid2];
                 else  right2 = Integer.MAX_VALUE;

                 if(left1 <= right2 && left2 <= right1){
                     if((n + m) % 2 == 0){
                         return (double) ((Math.max(left2, left1) + Math.min(right2, right1))/2.0);
                     }else{
                         return (double) (Math.max(left2,left1));
                     }
                 } else if (left1 > right2) {
                     end = mid1-1;
                 }else {
                     start = mid1+1;
                 }
             }
             return 0.0;
    }
}