class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int sum = 0;
         for(int i=0; i<nums.length; i++){
             sum += nums[i];
         }
         int nextSum = sum;
         int prevSum = 0;
         for(int i=0; i<nums.length; i++){
                 int ele = nums[i];
                 nextSum -= nums[i];
                 nums[i] = ((nums[i] * i) - prevSum) + (nextSum - ((nums.length-i-1) * nums[i]));
                 prevSum += ele;
         }
        return nums;
    }
}