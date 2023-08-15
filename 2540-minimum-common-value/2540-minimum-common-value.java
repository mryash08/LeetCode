class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        
        int num1 = 0; int num2 = 0;
        
        while(num1 < nums1.length && num2 < nums2.length){
            
            if(nums1[num1] == nums2[num2]){
                return nums1[num1];
            }else if(nums1[num1] > nums2[num2]){
                 num2++;
            }else{
                num1++;
            }
        }
        return -1;
    }
}