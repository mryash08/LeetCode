class Solution {
     List<List<Integer>> mainAns = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
          subsets(nums,0,new ArrayList<>());
          return mainAns;
    } 

    public void subsets(int[] nums,int idx,List<Integer> ans){
         if(idx == nums.length){
             ArrayList<Integer> temp = new ArrayList<>(ans);
             Collections.sort(temp);
             if(!mainAns.contains(temp)){
                  mainAns.add(temp);
             }
             return;
         }
         subsets(nums,idx+1,ans);
         ans.add(nums[idx]);
         subsets(nums,idx+1,ans);
         ans.remove(ans.size()-1);
    }
}