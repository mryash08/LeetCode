import java.util.*;
class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
         Arrays.sort(points, new Comparator<int[]>() {
                 public int compare(int[] o1, int[] o2) {
                   return o1[0] - o2[0];
                 }
         });
         int diff = Integer.MIN_VALUE;
         for(int i=1; i<points.length; i++){
             int temp = points[i][0] - points[i-1][0];
             if(diff < temp){
                 diff = temp;
             }
         }
        return diff;
    }
}