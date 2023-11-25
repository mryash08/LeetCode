class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
         for(int i=1; i<nums.length; i++){
             nums[i] += nums[i-1];
         }
         int[] ans = new int[nums.length];
         for(int i=0; i<nums.length; i++){
             if(i == 0){
                int nextSum = (nums[nums.length-1] - nums[i]) - (nums[0] * (nums.length-1));
                ans[0] = nextSum;
             }else{
                int ele = nums[i] - nums[i-1];
                int prevSum =  (i * ele) - nums[i-1] ;
                int nextSum =  (nums[nums.length-1] - nums[i]) - ((nums.length-i-1) * ele);
                ans[i] = prevSum + nextSum;
             }
            
         }
        return ans;
    }
}