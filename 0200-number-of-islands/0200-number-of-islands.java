class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;

        int rows = grid.length;
        int cols = grid[0].length;

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {

                if(grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }

        return count;
    }

    public void dfs(char[][] grid, int row, int col) {
        if(row < 0 || col < 0 ||
           row >= grid.length || col >= grid[0].length ||
           grid[row][col] == '0') {
            return;
        }
        grid[row][col] = '0';

        dfs(grid, row + 1, col); 
        dfs(grid, row - 1, col); 
        dfs(grid, row, col + 1); 
        dfs(grid, row, col - 1); 
    }
}