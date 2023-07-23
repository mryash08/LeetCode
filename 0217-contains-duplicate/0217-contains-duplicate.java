class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = 0;
        int m = 1;
        
        while(m <= nums.length-1){
            if(nums[n] == nums[m]){
                return true;
            }
            
            m++;
            n++;
            
        }
        
        return false;
        
    }
}