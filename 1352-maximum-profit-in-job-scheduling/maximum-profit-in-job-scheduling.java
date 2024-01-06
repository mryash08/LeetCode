class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int[][] endTemp = new int[endTime.length][3];
        for(int i=0; i<startTime.length; i++){
               endTemp[i][0] = startTime[i];
                endTemp[i][1] =  endTime[i];
                endTemp[i][2] =  profit[i];
        }
        Arrays.sort(endTemp,new Comparator<int[]>(){
                public int compare(int a[],int b[]){
                    return Integer.compare(a[0],b[0]);
                }
            });
        
        int max = 0;
        int[] dp = new int[startTime.length];
         return helper(endTemp,0,dp);
    }
    public int helper(int[][] endTime,int idx,int[] dp){
        if(idx == endTime.length){
            return 0;
        }
        if(dp[idx] != 0) return dp[idx];
        int max = -1; int start=idx+1; int end=endTime.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(endTime[idx][1] <= endTime[mid][0]){
               end = mid-1;
               max = mid;
            }else{
                start = mid+1;
            }
        }
        int include=endTime[idx][2];
        if(max != -1) include += helper(endTime,max,dp);
        int exclude = helper(endTime,idx+1,dp);
        return dp[idx] = Math.max(include,exclude);
    }
}