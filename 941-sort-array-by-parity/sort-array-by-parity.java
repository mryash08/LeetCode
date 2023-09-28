class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int j=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]%2 == 0){
                 swapNumber(nums,i,j);
                 j++;
            }
        }
        return nums;
    }

    public void swapNumber(int[] nums , int x, int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    } 
}