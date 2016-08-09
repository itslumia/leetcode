public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i=0; i<matrix.length; i++) {
            int s = 0;
            int e = matrix[i].length;
            while (s < e) {
                int m = s + (e-s)/2;
                if (matrix[i][m] == target) return true;
                else if (target < matrix[i][m]) e=m;
                else s=m+1;
            }
        }
        return false;
    }
}