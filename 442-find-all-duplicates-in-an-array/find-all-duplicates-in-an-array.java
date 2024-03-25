class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            while (i != nums[i] - 1 && nums[i] != -1) {
                if (nums[nums[i] - 1] == nums[i]) {
                    list.add(nums[i]);
                    nums[i] = -1;
                } else {
                    int temp = nums[nums[i] - 1];
                    nums[nums[i] - 1] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return list;
    }
}