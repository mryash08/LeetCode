class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int len = nums.length;
        int max_sum = 0;
        for(int i=0;i<k;i++){
            max_sum+=nums[i];
        }

        int window_sum = max_sum;
        for(int i = k;i<len;i++){
            window_sum-=nums[i-k];
            window_sum+=nums[i];
            max_sum = Math.max(max_sum,window_sum);
        }
        return (double)max_sum/k;
    }
}