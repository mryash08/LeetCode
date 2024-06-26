class Solution {
    public int longestEqualSubarray(List<Integer> nums, int k) {
        int right = 0; int left = 0; int ans = 0;
        int[] freq = new int[nums.size()+1];
        while(right < nums.size()){
            if(right - left - ans > k){
                freq[nums.get(left)]--;
                left++;
            }
            ans = Math.max(ans,++freq[nums.get(right)]);
            right++;
        }
        return ans;
        // HashMap<Integer,List<Integer>> map = new HashMap<>();
        // for(int i=0; i<nums.size(); i++){
        //      if(!map.containsKey(nums.get(i))){
        //          map.put(nums.get(i),new ArrayList<>());
        //      }
        //      List<Integer> list = map.get(nums.get(i));
        //      list.add(i);
        // }
        //  int ans = 1;
        // for(int i : map.keySet()){
        //     int k1 = k;
        //     int left = 0; int right = 0;
        //     List<Integer> list = map.get(i);
        //     while(right < list.size()-1){
        //         k1 -= list.get(right+1) - list.get(right)-1;
        //         right++;
        //         while(left <= right && k1 < 0){
        //             k1 += list.get(left+1) - list.get(left) -1;
        //             left++;
        //         }
        //          ans = Math.max(ans,right-left+1);
        //     }
        // }
        // return ans;
    }
}