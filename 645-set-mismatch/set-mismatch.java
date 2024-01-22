class Solution {
    public int[] findErrorNums(int[] nums) {

        for(int i=0; i<nums.length; i++){
            while(i+1 != nums[i] && nums[nums[i]-1] != nums[i]){
                swap(nums, nums[i]-1,i);
            }
        }
        int[] ans = new int[2];
        for(int i=0; i<nums.length; i++){
            if(i+1 != nums[i]){
                ans[0] = nums[i];
                ans[1] = i+1;
                return ans;
            }
        }
       return ans;
    }
    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    } 
}