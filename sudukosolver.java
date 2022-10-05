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
    private boolean sudokoSolver(char[][] board, int i, int j)
    {
        if(i == 9) return true;
        
        int ni = 0; 
        int nj = 0;
        if(j == 8)
        {
            ni = i+1;
            nj = 0;
        }
        else
        {
            ni = i;
            nj = j + 1;
        }
        
        if(board[i][j] != '.') 
        {
            if(sudokoSolver(board, ni, nj)) return true;
        }
        
        else
        {
            for(int n = 1; n <= 9; n++)
            {
                if(isValid(board, i, j, n))
                {
                    board[i][j] = (char) (n + '0');
                    
                    if(sudokoSolver(board, ni, nj)) return true;
                    
                    board[i][j] = '.';
                }
            }
        }
        
        return false;
    }
    
    public void solveSudoku(char[][] board) {
        
        sudokoSolver(board, 0, 0);
    }
}
    
    
