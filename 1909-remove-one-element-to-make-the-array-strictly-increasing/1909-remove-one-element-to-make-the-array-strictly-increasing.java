class Solution {
    public boolean canBeIncreasing(int[] nums) {
        
          if (nums.length == 2) {
            return true;
        }
          int count =0;

        for(int i=0; i<nums.length-1; i++){
            if(nums[i] >= nums[i+1]){
                if(i==0){
                    count++;

                }else {
                    if(nums[i-1] < nums[i+1]){
                        count++;
                        if(count == 2){
                            return false;
                        }
                    }else {
                        if(i+2 > nums.length-1){
                            count++;
                            if(count == 2){
                                return false;
                            }
                        }else {
                            if(nums[i] < nums[i+2]){
                                count++;
                                if(count == 2){
                                    return false;
                                }
                            }else {
                                return false;
                            }
                        }

                    }
                }

            }
        }
        return true;
    }
}