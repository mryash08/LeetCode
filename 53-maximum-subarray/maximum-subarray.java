class Solution {
    public int maxSubArray(int[] nums) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        while(right < nums.length){
            sum += nums[right];
            if(maxSum < sum)  maxSum = sum;
             while(sum < 0){
                 sum -= nums[left];
                 left++;
             }
             right++;
        }
         return maxSum;
    }
}