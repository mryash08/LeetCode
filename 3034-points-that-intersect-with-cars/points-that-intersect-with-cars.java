class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        Collections.sort(nums, new Comparator<List<Integer>>() {
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.get(0).compareTo(o2.get(0));
            }
        });
        int max = nums.get(0).get(1);
         int ans = (nums.get(0).get(1) - nums.get(0).get(0)) + 1;
        for(int i=1; i<nums.size(); i++){
            if(nums.get(i).get(0) <= max && nums.get(i).get(1) > max){
                ans += nums.get(i).get(1) - max;
                max = nums.get(i).get(1);
            }else if(nums.get(i).get(0) > max){
                ans += nums.get(i).get(1) - nums.get(i).get(0) +1;
                max = nums.get(i).get(1);
            }
        }
        return ans;
    }
}