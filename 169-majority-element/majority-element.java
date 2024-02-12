class Solution {
    public int majorityElement(int[] nums) {
        
        Arrays.sort(nums);
        
        if(nums.length == 1){
            return nums[0];
        }
        
        int n = 0;
        if(nums.length % 2  == 0){
            n = nums.length/2;
        }else{
            n = nums.length/2 + 1; 
        }
        int count=0;
        int index = 0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] == nums[index]){
                count++;
            }else{
                if(count >= n){
                    return nums[i-1];
                }else{
                    count = 1;
                    index = i;
                }
            }
        }
        
        
        return nums[count-1];
        
        
    }
}