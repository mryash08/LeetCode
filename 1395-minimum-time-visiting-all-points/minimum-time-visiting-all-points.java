class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;
        for(int i=1; i<points.length; i++){
            int rDiff =  Math.abs(points[i][0] - points[i-1][0]);
            int cDiff = Math.abs(points[i][1] - points[i-1][1]);
            ans+=rDiff;
            if(rDiff < cDiff){
                ans += (cDiff-rDiff);
            }
        }
        return ans;
    }
}