class Solution {
    public long countSubarrays(int[] nums, int k) {
        int lastIndex = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }
        int count = 0;
        int right = 0;
        int left = 0;
        boolean flag = false;
        while (right < nums.length && count < k) {
            if (nums[right] == max && !flag) {
                left = right;
                flag = true;
            }
            if (nums[right] == max)
                count++;
            right++;
        }
        right--;
        if (count != k)
            return 0;
        long ans = 0;
        while (right < nums.length) {
            long a = left - lastIndex;
            long b = nums.length - right - 1;
            ans += a + b + (a * b) + 1;
            lastIndex = left + 1;
            left++;
            right++;
            while (right < nums.length && nums[right] != max) {
                right++;
            }
            while (left < right && nums[left] != max) {
                left++;
            }
             
        }
        return ans;
    }
}