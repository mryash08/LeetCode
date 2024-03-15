class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
         ans[nums.length-1] = nums[nums.length-1];
        for(int i=nums.length-2; i>=0; i--){
           ans[i] = nums[i] * ans[i+1];
        }
        int product = 1;
        for(int i=0; i<nums.length-1; i++){
            ans[i] = product * ans[i+1];
            product *= nums[i];
        }
        ans[nums.length-1] = product;
        return ans;
    }
}