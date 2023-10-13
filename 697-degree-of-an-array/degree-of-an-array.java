class Solution {
    public int findShortestSubArray(int[] nums) {
        
        HashMap<Integer,int[]> map = new HashMap<>();
        int maxValue = -1;
        int maxLength = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
               int temp[] =  map.get(nums[i]);
               temp[1] = i;
               temp[2]++;
                map.put(nums[i],temp);
            }else{
                int temp[] = {i , i , 1};
                map.put(nums[i],temp);
            }

            int temp[] =  map.get(nums[i]);
            int count = temp[2];
            int diff = (temp[1] - temp[0]) + 1;
            

            if(count > maxValue || count == maxValue && diff < maxLength){
                maxValue = count;
                maxLength = diff;
            }
        }
        return maxLength;
    }
}