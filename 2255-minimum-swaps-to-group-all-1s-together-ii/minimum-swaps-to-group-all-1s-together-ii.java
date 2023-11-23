class Solution {
    public int minSwaps(int[] nums) {
        int count = 0;
        for(int i : nums){
            if(i == 1){
                count++;
            }
        }
        int start = 0;
        int end = 0;
        int currCount = 0;
        int ans = 0;
        int min = 0;
        for(; end<count; end++){
              if(nums[end] == 1){
                currCount++;
              }
        }
        min = count-currCount;
        for(; end<nums.length; end++){
            if(nums[start++] == 1) currCount--;
            if(nums[end] == 1) currCount++;
            min = Math.min(min,count-currCount);
        }
        end = 0;
        for(; start<nums.length; start++){
            if(nums[start] == 1) currCount--;
            if(nums[end++] == 1) currCount++;
            min = Math.min(min,count-currCount);
        }
        return min;
    }
}