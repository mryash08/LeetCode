class Solution {
    public int minOperations(int[] nums) {
        Arrays.sort(nums);
        int left=0;
        int right=0;
        int size=0;
        int diff=0;

        HashSet<Integer> set=new HashSet<>();
        while(right<nums.length){
            diff=nums[right]-nums[left];
            set.add(nums[right]);
            while(diff>nums.length-1){
                set.remove(nums[left]);
                left++;
                diff=nums[right]-nums[left];
            }
            if(diff<nums.length && set.size()>size)
            {
                size=set.size();
            }
            right++;
        }
            return nums.length-size;   
    }
}