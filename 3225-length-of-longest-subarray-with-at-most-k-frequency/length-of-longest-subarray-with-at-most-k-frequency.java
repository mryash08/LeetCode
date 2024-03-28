class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
         int min = Integer.MAX_VALUE;
         int max = Integer.MIN_VALUE;
         for(int i : nums){
              min = Math.min(i,min);
              max = Math.max(i,max);
         }
         int[] freq = new int[max - min+1];
         int left = 0; int right = 0; int ans = 0;
         while(right < nums.length){
            freq[nums[right]-min]++;
            while(freq[nums[right]-min] > k && left <= right){
                freq[nums[left]-min]--;
                left++;
            }
            ans = Math.max(ans,right-left+1);
            right++;
         }
         return ans;
    }
}