class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
         for(int i=1; i<nums.length; i++){
             nums[i] += nums[i-1];
         }
         int nextSum = 0;
         int prevSum = 0;
         int ele = 0;
         int lastpos = nums[nums.length-1];
         int lastVal = 0;
         for(int i=0; i<nums.length; i++){
             if(i == 0){
                 nextSum = (lastpos - nums[i]) - (nums[0] * (nums.length-1));
                 lastVal = nums[0];
                nums[0] = nextSum;
             }else{
                 ele = nums[i] - lastVal;
                 prevSum =  (i * ele) - lastVal ;
                 nextSum =  (lastpos - nums[i]) - ((nums.length-i-1) * ele);
                 lastVal = nums[i];
                nums[i] = prevSum + nextSum;
             }
            
         }
        return nums;
    }
}