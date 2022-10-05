class Solution {
    
    private boolean isValid(char[][] board, int row, int col, int n)
    {
        for(int i = 0; i < 9; i++)
        {
            if(board[row][i] == (char)(n + '0') || board[i][col] == (char)(n + '0')) return false;
        }
        
        int nr = row/3 * 3;
        int nc = col/3 * 3;
        
        for(int i = nr; i < nr+3; i++)
        {
            for(int j = nc; j < nc+3; j++)
            {
                if(board[i][j] == (char)(n + '0')) return false;
            }
        }
        
        return true;
    }
    
    