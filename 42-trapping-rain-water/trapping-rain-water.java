class Solution {
    public int trap(int[] height) {
         int max = Integer.MIN_VALUE;
         int[] minarr = new int[height.length];
         for(int i=height.length-1; i>=0; i--){
            max = Math.max(max,height[i]);
            minarr[i] = max;
         }
         int leftmax = height[0];
         int ans = 0;
         for(int i=0; i<height.length; i++){
             leftmax = Math.max(leftmax,height[i]);
              ans += Math.min(leftmax,minarr[i]) - height[i];
         }
         return ans;
    }
}