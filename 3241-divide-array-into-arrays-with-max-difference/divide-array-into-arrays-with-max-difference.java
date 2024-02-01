class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length / 3;
        int m = 3;
        int[][] ans = new int[n][m];
        for(int i=2; i<nums.length; i+=3){
              if(nums[i] - nums[i-1] <= k && nums[i] - nums[i-2] <= k){
                  int[] temp = new int[3];
                  temp[0] = nums[i-2];
                  temp[1] = nums[i-1];
                  temp[2] = nums[i];
                  ans[i/3] = temp;
              }else{
                  return new int[0][0];
              }
        }
        return ans;
    }
}