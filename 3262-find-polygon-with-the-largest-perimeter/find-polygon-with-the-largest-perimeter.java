class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }
        int i=nums.length-1;
        while(i >= 2){
              sum -= nums[i];
              if(sum > nums[i]){
                  return sum + nums[i];
              }
              i--;
        }
        return -1;
    }
}