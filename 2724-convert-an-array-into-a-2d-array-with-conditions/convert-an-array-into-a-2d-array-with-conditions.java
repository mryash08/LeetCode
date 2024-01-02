class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
         
         int[] freq = new int[201];
         List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
                 if(ans.size() <= freq[nums[i]]){
                     ans.add(new ArrayList<>());
                 }
                 ans.get(freq[nums[i]]).add(nums[i]);
                 freq[nums[i]]++;
        }
        return ans;

        // nlogn
        // Arrays.sort(nums);
        // List<List<Integer>> ans = new ArrayList<>();
        // int i=0; 
        // while(i<nums.length){
        //     int j = i; int index = 0;
        //     while(i<nums.length && nums[i] == nums[j]){
        //          if(ans.size() <= index){
        //              ans.add(new ArrayList<>());
        //          }
        //          ans.get(index).add(nums[i++]);
        //          index++;
        //     }
        // }
        // return ans;

    }
}