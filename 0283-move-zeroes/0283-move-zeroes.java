class Solution {
    public void moveZeroes(int[] nums) {
        
        int m = 0;
        int n = 1;
        
        while(n < nums.length){
            if(nums[m]  == 0 && nums[n] == 0){
                n++;
            }else if(nums[m] == 0){
                nums[m] = nums[n];
                nums[n]= 0;
                m++;
                n++;
            }else{
                m++;
                n++;
            }
        }
        
    }
}