class Solution {
    public int triangularSum(int[] nums) {
        int prev = 0;
        for(int i=0; i<nums.length-1; i++){
            prev = nums[i];
            for(int j=i+1; j<nums.length; j++){
                int temp =  (nums[j] + prev) % 10;
                prev = nums[j];
                nums[j] = temp;
            }
        }
       return nums[nums.length-1];
    }
}