class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
             max = Math.max(max,Helper(nums,i,dp));
        }
        return max;
    }

    public int Helper(int[] nums,int idx,int[] dp){
            if(idx >= nums.length){
                return 0;
            }
            if(dp[idx] != -1) return dp[idx];
            int temp = Integer.MIN_VALUE;
            for(int i=idx+2; i<nums.length+2; i++){
                temp = Math.max(temp,Helper(nums,i,dp));
            }
            dp[idx] = temp + nums[idx];
            return dp[idx];
    }
}