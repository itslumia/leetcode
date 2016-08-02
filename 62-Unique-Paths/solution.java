public class Solution {
    public int uniquePaths(int m, int n) {
        int[] ans = new int[n];
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (i==0) ans[j]=1;
                else {
                    ans[j] += j==0?0:ans[j-1];
                }
            }
        }
        return ans[n-1];
    }
}