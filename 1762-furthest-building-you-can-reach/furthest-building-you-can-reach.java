class Solution {
    public int furthestBuilding(int[] heights, int brick, int ladders) {
         int[] diff = new int[heights.length];

        for(int i=1; i<heights.length; i++){
            diff[i]  = heights[i] - heights[i-1];
        }
         int ans = 0;
        int start = 0; int end = heights.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            int[] temp = new int[mid+1];
            int bricks = brick;
            int ledder = ladders;
            for(int i=1; i<=mid; i++){
                temp[i] = diff[i];
            }
            Arrays.sort(temp);
            for(int i=1; i<temp.length; i++){
                if(temp[i] <= 0) continue;
                if(bricks >= temp[i]){
                    bricks -= temp[i];
                }else{
                    ledder--;
                }
            }
            if(ledder < 0){
                end = mid-1;
            }else{
                ans = mid;
                start = mid+1;
            }
        }
        int i=ans+1;
        while(i<diff.length && diff[i] <= 0){
            i++;
        }
        return i-1;
    }
}