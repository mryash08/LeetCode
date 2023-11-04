class Solution {
    public boolean checkPossibility(int[] nums) {
        int count = 0;
        if(nums.length <= 2) return true;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] > nums[i+1]){
                 if(i == 0) nums[i] = nums[i+1];
                 if(i < nums.length-2 && nums[i] <= nums[i+2]){
                     nums[i+1] = nums[i];
                     count++;
                 }else if(i >= 1 && nums[i-1] <= nums[i+1]){
                     nums[i] = nums[i-1];
                     count++;
                 }else if(i == nums.length-2 && count == 0){
                       return true;
                 }else{
                     return false;
                 }
                 
            }
            if(count == 2){
                return false;
            }
        }
        return true;
    }
}