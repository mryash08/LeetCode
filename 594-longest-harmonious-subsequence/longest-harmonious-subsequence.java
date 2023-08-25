class Solution {
    public int findLHS(int[] nums) {
        
       // HashMap<Integer,Integer> map = new HashMap<>();
        // int ans = 0;

        // for(int num : nums){
        //     map.put(num,map.getOrDefault(num,0)+1);
            
        //     if(map.containsKey(num-1)){
        //         ans = Math.max(ans,map.get(num-1) + map.get(num));
        //     }
        //      if(map.containsKey(num+1)){
        //         ans = Math.max(ans,map.get(num+1) + map.get(num));
        //     }

        // }

        // return ans;

        Arrays.sort(nums);

        int left = 0;
        int right = 0;
        int ans = 0;

        while(right < nums.length){
               
               while(nums[right] - nums[left] > 1){
                   left++;
               }

               if(nums[right] != nums[left]){
                   ans = Math.max(ans,right-left+1);
               }
               right++;

            
        }

            return ans;
    }
}