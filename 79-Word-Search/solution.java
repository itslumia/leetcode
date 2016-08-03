public class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[0].length; j++) {
                if (here(board, word, i, j, 0)) return true;
            }
        }
        return false;
    }
    
    private boolean here(char[][] board, String word, int row, int col, int index) {
        if (index == word.length()) return true;
        if (row < 0 || row == board.length || col < 0 || col == board[0].length) return false;
        char c = word.charAt(index);
        if (c != board[row][col]) return false;
        board[row][col] ^= 256;
        boolean y = here(board, word, row-1, col, index+1) ||
                    here(board, word, row+1, col, index+1) ||
                    here(board, word, row, col-1, index+1) ||
                    here(board, word, row, col+1, index+1);
        board[row][col] ^= 256;
        return y;
    
    }
}