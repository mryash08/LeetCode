class Solution {
    public int maxProductDifference(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secondMax = 0;
        int min = Integer.MAX_VALUE;
        int secondMin =  0;
        for(int i=0; i<nums.length; i++){
             if(nums[i] < min){
                  secondMin = min;
                  min = nums[i];
             }else if(nums[i] < secondMin){
                  secondMin = nums[i];
             }
             if(nums[i] > max){
                  secondMax = max;
                  max = nums[i];
             }else if(nums[i] > secondMax){
                  secondMax = nums[i];
             }
        }
        return (max * secondMax) - (min * secondMin );
    }
}