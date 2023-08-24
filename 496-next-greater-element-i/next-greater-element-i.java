class Solution {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        boolean flag = false;
        int curr = 0;
       for(int i=0; i< nums1.length; i++){
           flag = false;
           curr = nums1[i];
           for(int j=0; j< nums2.length; j++){

               if(nums1[i] == nums2[j]){
                   flag = true;
               }
               if(flag){
                   if(nums1[i] < nums2[j]){
                       nums1[i] = nums2[j];
                       break;
                   }
               }

           }
           if(curr == nums1[i]){
               nums1[i] = -1;
           }
       }
        return nums1;
    }
}