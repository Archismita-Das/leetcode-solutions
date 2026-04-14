class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];
                
                if (num != '.') {
                    // Check row
                    if (!set.add(num + " in row " + i)) return false;
                    
                    // Check column
                    if (!set.add(num + " in col " + j)) return false;
                    
                    // Check box
                    int boxRow = i / 3;
                    int boxCol = j / 3;
                    if (!set.add(num + " in box " + boxRow + "-" + boxCol)) return false;
                }
            }
        }
        
        return true;
    }
}