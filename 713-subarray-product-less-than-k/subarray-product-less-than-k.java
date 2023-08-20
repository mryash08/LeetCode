class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        int left  = 0;
        int right = 0;

       int multi = 1;
       int counter = 0;
        for(; left<nums.length; left++){
             
            multi *= nums[left];
            for(; multi >= k && left >= right; right++){
                multi /= nums[right];
            } 
           counter += (left - right + 1);
        }

        return counter;

    }
}