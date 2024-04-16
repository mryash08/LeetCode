class Solution {
    public int reductionOperations(int[] nums) {
        int[] freq = new int[50001];
        for(int i=0; i<nums.length; i++){
            freq[nums[i]]++;
        }
        int count = 0;
        int ans = 0;
        for(int i=0; i<freq.length; i++){
             if(freq[i] != 0) ans += freq[i] * count++;
        }
        return ans;
    }
}