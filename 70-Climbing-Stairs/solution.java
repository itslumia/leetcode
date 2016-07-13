public class Solution {
    public int climbStairs(int n) {
        if (n<=2) return n;
        int[] ans = new int[n+1];
        ans[0] = 0;
        ans[1] = 1;
        ans[2] = 2;
        for (int i=3; i<=n; i++) {
            ans[i] = ans[i-1] + ans[i-2];
        }
        return ans[n];
    }
    
    int helper(int n, int[] ans) {
        if (n <= 2) return ans[n];
        ans[n]=helper(n-1, ans)+helper(n-2, ans);
        return ans[n];
    }
}