class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int p1 = -1;
        int prevEle = nums[0];
        for(int i=1; i<nums.length; i++){
             
             if(nums[i] != prevEle) count = 0;
             if(p1 == -1) prevEle = nums[i];
             count++;
             if(count >= 3){
                  if(p1 == -1) p1 = i;
             }
             if(count <= 2 && p1 != -1){
                 prevEle = nums[i];
                 int temp = nums[p1];
                 nums[p1++] = nums[i];
                 nums[i] = temp;
             }
        }
        if(p1 == -1) return nums.length;
       return p1;
    }
}