class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
         HashMap<Integer,Integer> map = new HashMap<>();
         int left = 0; int right = 0; int ans = 0;
         while(right < nums.length){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(map.get(nums[right]) > k && left <= right){
                map.put(nums[left],map.get(nums[left])-1);
                left++;
            }
            ans = Math.max(ans,right-left+1);
            right++;
         }
         return ans;
    }
}