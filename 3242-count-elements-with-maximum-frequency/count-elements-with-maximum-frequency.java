class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        int max = Integer.MIN_VALUE;
        for(int i : nums){
            freq[i]++;
            max = Math.max(max,freq[i]);
        }
          int ans = 0;
        for(int  i:freq){
           if(i == max){
               ans += i;
           }
        }
        return ans;
    }
}