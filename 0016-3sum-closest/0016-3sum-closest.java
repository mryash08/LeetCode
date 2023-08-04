class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
       int ans = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0; i< nums.length-2; i++) {
            int j = i + 1;
            int k = nums.length-1;
            while (j < k) {
                 int sum = nums[i] + nums[j] + nums[k];
                 if(sum == target){
                     return sum;
                 }else if(sum > target){
                     if(Math.abs(target-ans) > Math.abs(target-sum)){
                         ans = sum;
                     }
                     k--;
                 }else {
                     if(Math.abs(target-ans) > Math.abs(target-sum)){
                         ans = sum;
                     }
                     j++;
                 }
            }
        }

return ans;
        
    }
}