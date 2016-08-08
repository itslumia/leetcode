public class Solution {
    public int maximalSquare(char[][] matrix) {
        if (matrix.length == 0) return 0;
        int max = 0;
        for (int i=0; i<matrix[0].length; i++) if (matrix[0][i] == '1') max = 1;
        for (int i=0; i<matrix.length; i++) if (matrix[i][0] == '1') max = 1;
        
        for (int i=1; i<matrix.length; i++) {
            for (int j=1; j<matrix[0].length; j++) {
                int left = matrix[i][j-1] - '0';
                int top = matrix[i-1][j] - '0';
                int corner = matrix[i-1][j-1] - '0';
                if (matrix[i][j] == '1') {
                    int now = 1;
                    if (left >= 1 && top >= 1 && corner >= 1) {
                        now = Math.min(corner, Math.min(left, top)) + 1;
                        matrix[i][j] = (char) (now+48);
                    }
                    max = Math.max(max, now);
                }
            }
        }
        return max*max;
    }
}