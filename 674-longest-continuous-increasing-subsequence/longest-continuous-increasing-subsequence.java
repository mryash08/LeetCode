class Solution {
    public int findLengthOfLCIS(int[] nums) {

        int left = 0;
        int right = 1;
        int maxCount = 0;
        int count = 0;

        while(right < nums.length){
            if(nums[right] <= nums[right-1]){
                count = right-left;
                left = right;
                if(maxCount <  count){
                    maxCount = count;
                    count = 0;
                }
            }
            right++;
        }
        count = right-left;
                if(maxCount <  count){
                    maxCount = count;
                    count = 0;
                }
        return maxCount;
    }
}