class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length, n = board[0].length;
        int[] dirs = {-1, 0, 1};

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int live = 0;

                for (int x : dirs) {
                    for (int y : dirs) {
                        if (x == 0 && y == 0) continue;

                        int r = i + x, c = j + y;

                        if (r >= 0 && r < m && c >= 0 && c < n &&
                            (board[r][c] == 1 || board[r][c] == 2)) {
                            live++;
                        }
                    }
                }

                if (board[i][j] == 1 && (live < 2 || live > 3)) {
                    board[i][j] = 2;
                }

                if (board[i][j] == 0 && live == 3) {
                    board[i][j] = -1;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 2) board[i][j] = 0;
                if (board[i][j] == -1) board[i][j] = 1;
            }
        }
    }
}