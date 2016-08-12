public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        if (n == 1) return 10;
        if (n == 2) return 91;
        if (n > 10) return 0;
        int ans = 91;
        for (int i=3; i<=n; i++) {
            ans += 9 * times(i);
        }
        return ans;
    }
    
    private int times(int i) {
        int k = 9 - i + 2;
        int ans = 1;
        while (k <= 9) {
            ans *= k;
            k++;
        }
        return ans;
    }
}