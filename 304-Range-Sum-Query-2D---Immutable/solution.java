public class NumMatrix {
    private int[][] board;
    
    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        if (m == 0) return;
        int n = matrix[0].length;
        
        board = new int[m+1][n+1];
        //board[0][0] = matrix[0][0];
        //for (int i=1; i<n; i++) board[0][i] = board[0][i-1] + matrix[0][i];
        //for (int j=1; j<m; j++) board[j][0] = board[j-1][0] + matrix[j][0];
        for (int i=1; i<=m; i++) {
            for (int j=1; j<=n; j++) {
                board[i][j] = matrix[i-1][j-1] + board[i-1][j] + board[i][j-1] - board[i-1][j-1];
            }
        }
        
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return board[row2+1][col2+1] - board[row2+1][col1] - board[row1][col2+1] + board[row1][col1];
    }
}


// Your NumMatrix object will be instantiated and called as such:
// NumMatrix numMatrix = new NumMatrix(matrix);
// numMatrix.sumRegion(0, 1, 2, 3);
// numMatrix.sumRegion(1, 2, 3, 4);