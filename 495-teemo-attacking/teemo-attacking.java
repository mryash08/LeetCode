class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
         int rangeEnd =0;
        int ans = 0;

         if(timeSeries[0] == 0){
            ans += duration;
            rangeEnd = duration-1;
        }

        for(int i=0; i<timeSeries.length; i++){

             if(timeSeries[i] > rangeEnd){
                 ans += duration;
             }else{
                 ans += (timeSeries[i]+(duration-1)) - rangeEnd;
             }
             rangeEnd = timeSeries[i]+(duration-1);
        }
         return ans;
    }
}