class Solution {
        public long countSubarrays(int[] A, int minK, int maxK) {
        long ans = 0, oRange = -1, min = -1, max = -1, n = A.length;
        for (int i = 0; i < n; i++) {
            if (A[i] < minK || A[i] > maxK) oRange = i;
            if (A[i] == minK) min = i;
            if (A[i] == maxK) max = i;
            ans += Math.max(0L, Math.min(min, max) - oRange);
        }
        return ans;
    }
}