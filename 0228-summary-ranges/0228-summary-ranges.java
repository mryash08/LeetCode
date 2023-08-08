class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> list = new ArrayList<>();
        
        if(nums.length < 1){
            return list;
        }

        int start = 0;
        for(int i=0; i< nums.length-1; i++){
            if(nums[i] != (nums[i+1] - 1)){
                if(i == start){
                    list.add("" + nums[i]);
                    start = i+1;
                }else {
                    list.add(nums[start] + "->" + nums[i]);
                    start = i+1;

                }
            }
        }

            if(nums.length-1 == start){
                list.add("" + nums[nums.length-1]);
            }else {
                list.add(nums[start] + "->" + nums[nums.length-1]);
            }

            return list;
    }
}