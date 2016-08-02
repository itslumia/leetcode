public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] ans = new int[m][n];
        for (int i=0; i<n; i++) {
            if (obstacleGrid[0][i] != 1) ans[0][i]=1;
            else {
                for (int j=i; j<n; j++) ans[0][j]=0;
                i=n;
            }
        }
        
        for (int i=0; i<m; i++) {
            if (obstacleGrid[i][0] != 1) ans[i][0]=1;
            else {
                for (int j=i; j<m; j++) ans[j][0]=0;
                i=m;
            }
        }
        
        for (int i=1; i<m; i++) {
            for (int j=1; j<n; j++) {
                if (obstacleGrid[i][j] == 1) ans[i][j]=0;
                else ans[i][j]=ans[i-1][j] + ans[i][j-1];;
            }
        }
        return ans[m-1][n-1];
    }
}