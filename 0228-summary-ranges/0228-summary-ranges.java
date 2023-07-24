class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        ArrayList<String> list = new ArrayList<>();
        
       int start = 0; 
        
        if(nums.length == 1){
            list.add(nums[start] + "");
            return list;
        }else if(nums.length == 0){
               return list;
        }
        
        for(int i=0; i<nums.length; i++){
            
           
           if(i < nums.length-1 && nums[i]+1 != nums[i+1]){
               if(nums[start] == nums[i]){
                    list.add(nums[start] + "");
               }else{
               list.add(nums[start] + "->" + nums[i]);
               }
               start = i+1;
               continue;
           } else if(i == nums.length-1 && nums[i-1] == nums[i]-1){
                if(nums[start] == nums[i]){
                    list.add(nums[start] + "");
               }else{
               list.add(nums[start] + "->" + nums[i]);
               }
               start = i+1;
               continue;
           } else if(start == nums.length-1){
                list.add(nums[start]+"");
           }
        }
        return list;
    }
}