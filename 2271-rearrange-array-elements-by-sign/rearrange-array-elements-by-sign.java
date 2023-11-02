class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        int k=0,j=nums.length-1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                arr[k++] = nums[i];
            }else{
                arr[j--] = nums[i];
            }
        }
        k=0;
        j=nums.length-1;
        for(int i=0;i<nums.length; i++){
            if(i % 2 == 0){
                nums[i] = arr[k++];
            }else{
                nums[i] = arr[j--];
            }
        }
        return nums;
    }
}