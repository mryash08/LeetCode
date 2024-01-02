class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int i=0; 
        while(i<nums.length){
            int j = i; int index = 0;
            while(i<nums.length && nums[i] == nums[j]){
                 if(ans.size() <= index){
                     ans.add(new ArrayList<>());
                 }
                 ans.get(index).add(nums[i++]);
                 index++;
            }
        }
        return ans;
    }
}