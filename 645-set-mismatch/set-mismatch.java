class Solution {
    public int[] findErrorNums(int[] nums) {

       int[] arr = new int[2];
       HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                arr[0] = nums[i];
            }else{
                set.add(nums[i]);
            }
        }
        
        arr[1] = nums.length;
        int n = 1;
        for(int num : set){
            if(n != num){
                arr[1] = n;
                return arr;
            }
            n++;
        }
           

        

          return arr;
    }
}