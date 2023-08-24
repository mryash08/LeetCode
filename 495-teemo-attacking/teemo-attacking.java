class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
          int ans = duration;


        for(int i=1; i<timeSeries.length; i++){

             if(timeSeries[i] > timeSeries[i-1]+(duration-1)){
                 ans += duration;
             }else{
                 ans += (timeSeries[i]+(duration-1)) - (timeSeries[i-1]+(duration-1));
             }

        }
         return ans;
    }
}