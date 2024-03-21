class Solution {
    public int numIslands(char[][] grid) {
        boolean[][] isVisited = new boolean[grid.length][grid[0].length];
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (!isVisited[i][j] && grid[i][j] == '1') {
                    Helper(grid, i, j, isVisited);
                    ans++;
                }
            }
        }
        return ans;

    }

    public void Helper(char[][] grid, int i, int j, boolean[][] isVisited) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || isVisited[i][j] || grid[i][j] == '0') {
            return;
        }
        isVisited[i][j] = true;
        Helper(grid, i - 1, j, isVisited);
        Helper(grid, i, j - 1, isVisited);
        Helper(grid, i + 1, j, isVisited);
        Helper(grid, i, j + 1, isVisited);
    }
}