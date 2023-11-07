class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int n = dist.length;
        int[] times = new int[n];
        for (int i = 0; i < n; i++) {
            times[i] = (int)Math.ceil((double)dist[i] / speed[i]);
        }
        Arrays.sort(times);
        for (int i = 0; i < n; i++) {
            if (i >= times[i]) {
                return i;
            }
        }
        return n;
    }
}