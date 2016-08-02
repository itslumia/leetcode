public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0;
        if (target < matrix[0][0] || target > matrix[m-1][n-1]) return false;
        int s = 0; 
        int e = m-1;
        while (s < e) {
            int mid = s + (e - s)/2;
            if (target <= matrix[mid][0]) e=mid;
            else s=mid+1;
        }
        if (matrix[s][0] > target) row=s-1;
        else row = s;
        
        s=0;
        e=n-1;
        while (s<=e) {
            int mid = s + (e - s)/2;
            if (target == matrix[row][mid]) return true;
            else if (target < matrix[row][mid]) e=mid-1;
            else s=mid+1;
        }
        return false;
        
    }
}