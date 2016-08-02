public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int s = 0;
        int e = m*n-1;
        if (e == 0 && matrix[0][0] == target) return true;
        while (s <= e) {
            int mid = s + (e-s)/2;
            if (matrix[mid/n][mid%n] == target) return true;
            else if (matrix[mid/n][mid%n] < target) s=mid+1;
            else e=mid-1;
        }
        return false;
        
    }
}