class Solution {
    public int numEnclaves(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            Helper(grid, i, 0);
            Helper(grid, i, grid[0].length - 1);
        }
        for (int i = 0; i < grid[0].length; i++) {
            Helper(grid, 0, i);
            Helper(grid, grid.length - 1, i);
        }

        int ans = 0;
        for (int i = 1; i < grid.length - 1; i++) {
            for (int j = 1; j < grid[0].length - 1; j++) {
                if (grid[i][j] == 1) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public void Helper(int[][] grid, int row, int col) {
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] != 1) {
            return;
        }
        grid[row][col] = 0;
        Helper(grid, row + 1, col);
        Helper(grid, row - 1, col);
        Helper(grid, row, col + 1);
        Helper(grid, row, col - 1);
    }
}