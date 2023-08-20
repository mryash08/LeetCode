class Solution {
    public int longestSubarray(int[] nums) {
        
        int current = 0;
        int previous = 0;
        int ans = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0 ){
                ans = Math.max(current+previous , ans);
                previous = current;
                current = 0;
            }else{
                current++;
            }
        }

        ans = Math.max(current+previous , ans);

        if(ans == nums.length){
            return ans-1;
        }

        return ans;
    }
}