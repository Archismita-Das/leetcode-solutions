class Solution {
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        boolean vis[][]=new boolean[n][m];
        // top row
        for(int i=0;i<m;i++){
            if(board[0][i]=='O' && !vis[0][i]){
                dfs(board,0,i,vis);
            }
        }
        // left column
        for(int i=1;i<n-1;i++){
            if(board[i][m-1]=='O' && !vis[i][m-1]){
                dfs(board,i,m-1,vis);
            }
        }
        // bottom row
        for(int i=m-1;i>=0;i--){
            if(board[n-1][i]=='O' && !vis[n-1][i]){
                dfs(board,n-1,i,vis);
            }
        }
        // right column
        for(int i=n-2;i>0;i--){
            if(board[i][0]=='O' && !vis[i][0]){
                dfs(board,i,0,vis);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!vis[i][j] && board[i][j]=='O'){
                    board[i][j]='X';
                }
            }
        }
    }
    public static void dfs(char[][]board,int i,int j,boolean[][]vis){
        int n=board.length;
        int m=board[0].length;
        if(i>n-1 || j>m-1 || i<0 || j<0 || board[i][j]=='X'|| vis[i][j]){
            return;
        }
        vis[i][j]=true;
        dfs(board,i+1,j,vis);
        dfs(board,i-1,j,vis);
        dfs(board,i,j+1,vis);
        dfs(board,i,j-1,vis);
    }
}