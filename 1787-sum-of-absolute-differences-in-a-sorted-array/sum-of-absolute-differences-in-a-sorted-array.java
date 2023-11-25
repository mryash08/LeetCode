class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
         for(int i=1; i<nums.length; i++){
             nums[i] += nums[i-1];
         }
         int nextSum = 0;
         int prevSum = 0;
         int ele = 0;
         int lastpos = nums[nums.length-1];
         int[] ans = new int[nums.length];
         for(int i=0; i<nums.length; i++){
             if(i == 0){
                 nextSum = (lastpos - nums[i]) - (nums[0] * (nums.length-1));
                ans[0] = nextSum;
             }else{
                 ele = nums[i] - nums[i-1];
                 prevSum =  (i * ele) - nums[i-1] ;
                 nextSum =  (lastpos - nums[i]) - ((nums.length-i-1) * ele);
                ans[i] = prevSum + nextSum;
             }
            
         }
        return ans;
    }
}