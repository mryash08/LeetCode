class Solution {
    public int minSwaps(int[] nums) {
        for(int i=1; i<nums.length; i++){
            nums[i] += nums[i-1];
        }
        int start = 1;
        int end = nums[nums.length-1];
        if(end == 0) return 0;
        int min = end - nums[(end)-1];
        while(end < nums.length){
            min = Math.min(min,nums[nums.length-1] - (nums[end++]-nums[(start++)-1]));
        }
        end = 0;
        while(start < nums.length){
            min = Math.min(min,nums[nums.length-1] - ((nums[nums.length-1]-(nums[(start++)-1])) + nums[end++]));
        }

        return min;
    }
}