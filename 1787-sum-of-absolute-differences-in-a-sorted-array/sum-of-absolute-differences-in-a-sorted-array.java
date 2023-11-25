class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
         for(int i=1; i<nums.length; i++){
             nums[i] += nums[i-1];
         }
         int[] ans = new int[nums.length];
         for(int i=0; i<nums.length; i++){
             if(i == 0){
                ans[0] = (nums[nums.length-1] - nums[i]) - (nums[0] * (nums.length-1));
             }else{
                ans[i] = (i * (nums[i] - nums[i-1])) - nums[i-1] + (nums[nums.length-1] - nums[i]) - ((nums.length-i-1) * (nums[i] - nums[i-1]));
             }
            
         }
        return ans;
    }
}