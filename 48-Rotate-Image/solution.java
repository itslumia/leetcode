public class Solution {
    public void rotate(int[][] matrix) {
        swapUD(matrix);
        swapSym(matrix);
    }
    
    private void swapUD(int[][] matrix) {
        int m = matrix.length-1;
        for (int i=0; i<matrix.length/2; i++) {
            int[] tmp = matrix[i];
            matrix[i] = matrix[m-i];
            matrix[m-i] = tmp;
            
        }
    }
    
    private void swapSym(int[][] matrix) {
        for (int i=0; i<matrix.length; i++) {
            for (int j=i+1; j<matrix[0].length; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }
    
    private void swap(int a, int b) {
        int m = a;
        a = b;
        b = m;
    }
}