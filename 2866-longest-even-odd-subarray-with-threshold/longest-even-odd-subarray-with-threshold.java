class Solution {

    public int startPoint(int startIndex,int[] nums , int threshold){

        for(int i=startIndex; i<nums.length; i++){
            if(nums[i] % 2 == 0 && nums[i] <= threshold){
                return i;
            }
        }
        return -5;
    }
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        
        int left = startPoint(0,nums,threshold);
        int right;
        int ans = 0;
        if(left != -5){
          ans = Math.max(ans,1);
        }
        for(right=left+1; right >= 0 && right < nums.length; right++){
            if(nums[right]%2 != nums[right-1]%2 && nums[right] <= threshold){
                     ans = Math.max(ans,(right-left)+1);
            }else{
                 right = startPoint(right,nums,threshold);
                 left = right;
                 if(right == nums.length-1){
                     ans = Math.max(ans,1);
                 }
            }
        }
        return ans;
    }
}