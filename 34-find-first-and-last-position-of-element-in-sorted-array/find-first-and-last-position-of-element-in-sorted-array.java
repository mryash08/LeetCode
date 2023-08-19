class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int m=0;
        int n=nums.length-1;
        
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
   
        while(m<=n){
            int mid = m + (n-m)/2;

            if(nums[mid] == target){
               ans[0] = mid;
                n = mid-1;
            }else if (nums[mid] < target){
                m = mid+1;
            }else{
                n = mid-1;
            }
            
        }

          m=0;
        n=nums.length-1;

        while(m<=n){
            int mid = m + (n-m)/2;

            if(nums[mid] == target){
               ans[1] = mid;
                m = mid+1;
            }else if (nums[mid] < target){
                m = mid+1;
            }else{
                n = mid-1;
            }
            
        }

        
        
        return ans;
    }
}