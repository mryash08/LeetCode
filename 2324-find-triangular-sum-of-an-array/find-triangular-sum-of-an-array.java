class Solution {
    public int triangularSum(int[] nums) {
       int n= nums.length;
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<n-1;j++){
                nums[j]=(nums[j]+nums[j+1])%10;
            }
            n--;
        }
        return nums[0]%10;
    }
}