class Solution {
    public int[] sortedSquares(int[] nums) {
        int idx1=nums.length-1; int idx2 = 0;
        if(nums[0] >= 0) {
            idx1 = -1;
        }
        if(nums[nums.length-1] < 0){
            idx2 = nums.length;
        }
        for(int i=1; i<nums.length; i++){
            if(nums[i-1] < 0 && nums[i] >= 0 ){
                idx2 = i;
                idx1 = i-1;
                break;
            }
        }
        int[] ans = new int[nums.length];
        int i = 0;
        while(idx1>=0 && idx2 < nums.length){
            int sq1 = nums[idx1] * nums[idx1];
            int sq2 = nums[idx2] * nums[idx2];
            if(sq1 < sq2){
                ans[i++] = sq1;
                idx1--;
            }else{
                ans[i++] = sq2;
                idx2++;
            }
        }
        while(idx2 < nums.length){
            int sq2 = nums[idx2] * nums[idx2];
            ans[i++] = sq2;
            idx2++;
        }
        while(idx1>=0){
            int sq1 = nums[idx1] * nums[idx1];
            ans[i++] = sq1;
            idx1--;
        }
        return ans;
    }
}