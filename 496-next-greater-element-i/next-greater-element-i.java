class Solution {
   public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int curr = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i< nums2.length; i++){
            map.put(nums2[i],i);
        }
       for(int i=0; i< nums1.length; i++){

           curr = nums1[i];
           for(int j=map.get(nums1[i]); j< nums2.length; j++){


                   if(nums1[i] < nums2[j]){
                       nums1[i] = nums2[j];
                       break;
                   }


           }
           if(curr == nums1[i]){
               nums1[i] = -1;
           }
       }
        return nums1;
    }
}