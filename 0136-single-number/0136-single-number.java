class Solution {
    public int singleNumber(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
        
        for(int num : nums){
            if(set.contains(num)){
                set.remove(num);
            }else{
                set.add(num);
            }
        }
        
        for(int single : set){
            return single;
        }
        
        return -1;
    }
}