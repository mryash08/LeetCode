class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int[][] freq = new int[100001][2];
        for(int i=0; i<matches.length; i++){
            freq[matches[i][0]][0]++;
            freq[matches[i][1]][1]++;
        }
        List<Integer> win = new ArrayList<>();
        List<Integer> lose = new ArrayList<>();
        for(int i=0; i<freq.length; i++){
            if(freq[i][1] == 0 && freq[i][0] != 0) win.add(i);
            if(freq[i][1] == 1) lose.add(i);
        }
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(win);
        ans.add(lose);
        return ans;
    }
}