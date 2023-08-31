class Solution {
    public double findMaxAverage(int[] nums, int k) {

            double sum = 0.0;
           double ans = Integer.MIN_VALUE;
       for(int i=0; i<k; i++){
           sum += nums[i];
       }
        
        for(int i=k; i<nums.length; i++){
                
                ans = Math.max(ans,sum/k);
                sum -= nums[i-k];
                sum += nums[i];
        }
           
        ans = Math.max(ans,sum/k);
        return ans;
    }
}