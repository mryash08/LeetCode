class Solution {
    public int trap(int[] height) {
         int left = 0;
         int right = height.length-1;
         int leftmax = height[0];
         int rightmax = height[right];
         int ans = 0;
         while(left < right){
            if(leftmax <= rightmax){
                ans += leftmax - height[left];
                left++;
                leftmax = Math.max(leftmax,height[left]);
            }else{
                ans += rightmax - height[right];
                right--;
                rightmax = Math.max(rightmax,height[right]);
            }
         }
         return ans;
    }
}