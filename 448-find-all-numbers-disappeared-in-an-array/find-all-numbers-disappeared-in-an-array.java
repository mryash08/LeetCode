class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {


        List<Integer> list = new ArrayList<>();

       for(int i=0; i<nums.length; i++){
           list.add(i+1);
       }

        for(int i=0; i<nums.length; i++){
            if(list.get(nums[i]-1) == nums[i]){
                list.set(nums[i]-1,0);
            }
        }

        for(int i=0; i<list.size(); i++){
            if(list.get(i) == 0){
                list.remove(i);
                i--;
            }
        }

        return list;

          

        
    }
}