class Solution {
    public int firstMissingPositive(int[] nums) {
        for(int i=0; i<nums.length; i++){
             while(i+1 != nums[i] && nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i]-1]){
                 swap(i,nums[i]-1,nums);
             }
        }
        for(int i=0; i<nums.length; i++){
            if(i+1 != nums[i]) return i+1;
        }
        return nums.length+1;
    }
    public void swap(int p1,int p2,int[] nums){
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
    }
}