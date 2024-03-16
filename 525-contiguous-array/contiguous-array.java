class Solution {
    public int findMaxLength(int[] nums) {
      HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0; int max=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                nums[i] = -1;
            }
            sum += nums[i];
            if(sum == 0){
                max = Math.max( i+1 , max);
            }else{
               if(map.containsKey(sum)){ 
                max = Math.max((i - map.get(sum)) , max);
            }else{
                map.put(sum,i);
            }
            }
        }
    
       return max;
    }
}