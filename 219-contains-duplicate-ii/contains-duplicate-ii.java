class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
       Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i< nums.length; i++){
            if(Math.abs(i-k) < 0){
                map.remove(i-k);
            }
            if(map.containsKey(nums[i]) && Math.abs(map.get(nums[i])-i) <= k ){
                    return true;
            }else {
                map.put(nums[i], i);
            }
        }
       return false;
    }
}