class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,Comparator.comparingInt(o -> o[0]));
         int  prevEnd = points[0][1];
         int count = 0;
          for(int i=1; i<points.length; i++){
               if(prevEnd >= points[i][0]){
                  if(prevEnd > points[i][1]){
                      prevEnd = points[i][1];
                  }
              }else{
                prevEnd = points[i][1];
                  count++;
              }
          }
          return count+1;
    }
}