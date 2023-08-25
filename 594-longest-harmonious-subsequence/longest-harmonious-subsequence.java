class Solution {
    public int findLHS(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0;

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
            
            if(map.containsKey(num-1)){
                ans = Math.max(ans,map.get(num-1) + map.get(num));
            }
             if(map.containsKey(num+1)){
                ans = Math.max(ans,map.get(num+1) + map.get(num));
            }

        }

        return ans;
    }
}