class Solution {
    public double findMaxAverage(int[] nums, int k) {
           
           int left = 0;
           int right = 0;
           double sum = 0.0;
           double ans = Integer.MIN_VALUE;
           while(right < nums.length){
               sum += nums[right];
                if(right - left + 1 == k){
                      ans = Math.max(ans,sum/k);
                      sum -= nums[left];
                      left++;
                }
                right++;
           }
        
        return ans;
    }
}