public class Solution {
    public int climbStairs(int n) {
        if (n<=2) return n;
        int zero = 0;
        int one = 1;
        int two = 2;
        int ans = 0;
        for (int i=3; i<=n; i++) {
            ans = one + two;
            
            one = two;
            
            two = ans;
        }
        return ans;
    }
}