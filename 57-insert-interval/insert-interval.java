class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int start = newInterval[0];
        int end = newInterval[1];
        boolean flag = false;
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            if (!flag) {
                if (intervals[i][1] >= newInterval[0]) {
                    if (intervals[i][0] > newInterval[1]) {
                        list.add(newInterval);
                        list.add(intervals[i]);
                        flag = true;
                    } else {
                        newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
                        newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
                        list.add(newInterval);
                        flag = true;
                    }
                } else {
                    list.add(intervals[i]);
                }
            } else {
                if (list.get(list.size()-1)[1] >= intervals[i][0]) {
                    newInterval[0] = Math.min(list.get(list.size()-1)[0], intervals[i][0]);
                    newInterval[1] = Math.max(list.get(list.size()-1)[1], intervals[i][1]);
                    list.remove(list.size() - 1);
                    list.add(newInterval);
                } else {
                    list.add(intervals[i]);
                }
            }
        }
        if(list.size()==0 || list.get(list.size()-1)[1] < start){
            list.add(newInterval);
        }
        int[][] ans = new int[list.size()][];
        int i = 0;
        for (int[] j : list) {
            ans[i++] = j;
        }
        return ans;
    }
}