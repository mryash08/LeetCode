class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
        int[] set = new int [1001];
        for (int i : nums1) set[i] = 1;
        int resCount = 0;
        for (int i : nums2) {
            if (set[i] == 1) {
                set[i] = 2;
                ++resCount;
            }
        }
        int[] res = new int[resCount];
        int i = 0;
        int[] nums = nums2.length > nums1.length ? nums1 : nums2;
        for (int v : nums) {
            if (set[v] == 2) {
                res[i++] = v;
                set[v] = 1;
            }
        }
        return res;
    }
}