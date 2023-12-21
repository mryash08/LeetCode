import java.util.*;
class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
         int[] temp = new int[points.length];
         for(int i=0; i<points.length; i++){
             temp[i] = points[i][0];
         }
         Arrays.sort(temp);
         int diff = Integer.MIN_VALUE;
        for(int i=1; i<temp.length; i++){
            int tempDiff = temp[i] - temp[i-1];
            if(diff < tempDiff){
                diff = tempDiff;
            }
        }
        return diff;
    }
}