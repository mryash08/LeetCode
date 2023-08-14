class Solution {
    public boolean canBeIncreasing(int[] nums) {
        
         int count =0;

        for(int i=0; i< nums.length; i++){
            for(int j=0; j<nums.length-1; j++){
                if(j != i ){
                    if(j+1 == i){
                        if(j+2 < nums.length && nums[j] >= nums[j+2]){
                            break;
                        } else {
                            count++;
                        }
                    }else {
                        if(nums[j] >= nums[j+1]){
                            break;
                        }else {
                            count++;
                        }
                    }

                }

            }
            if(count >= nums.length-2){
                return true;
            }
            count = 0;
        }

        return false;
    }
}