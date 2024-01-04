class Solution {
    public int minOperations(int[] nums) {
        Arrays.sort(nums);

        int ans = 0;
        int start = 0;
        while(start < nums.length){
            int end = start;
            
            while(end < nums.length && nums[end] == nums[start]) {
                end++;
            }
            int count = end-start;
            if(count == 1) return -1;
            ans += count/3;

            if(count%3 != 0) ans++;
            start=end;
        }
        return ans;
    }
}