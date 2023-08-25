class Solution {
    public int maximumProduct(int[] nums) {

        // int firstMax = -1001;
        // int secondMax = -1001;
        // int thirdMax = -1001;

        // int firstMin = 1001;
        // int secondMin = 1001;

        // for(int i=0; i<nums.length; i++){
        //     if(firstMax < nums[i]){
        //         thirdMax = secondMax;
        //         secondMax = firstMax;
        //         firstMax = nums[i];
        //     }else if(secondMax < nums[i]){
        //         thirdMax = secondMax;
        //         secondMax = nums[i];
        //     }else if (thirdMax < nums[i]){
        //         thirdMax = nums[i];
        //     }

        //     if(firstMin > nums[i]){
        //         secondMin = firstMin;
        //         firstMin = nums[i];
        //     }else if (secondMin > nums[i] ){
        //         secondMin = nums[i];
        //     }
        // }

        //  if (firstMax * secondMax * thirdMax < firstMin * secondMin * firstMax ){
        //      return firstMin * secondMin * firstMax;
        //  }
        // return firstMax * secondMax * thirdMax;

        Arrays.sort(nums);

        if(nums[0] * nums[1] * nums[nums.length-1] > nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3] ){
            return nums[0] * nums[1] * nums[nums.length-1];
        }
        return nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3];
    }
}