public class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] ans = new int[n];
        int[] index = new int[primes.length];
        
        if (n == 1) return 1;
        ans[0] = 1;
        for (int i=1; i < n; i++) {
            ans[i] = Integer.MAX_VALUE;
            for (int j=0; j<primes.length; j++) {
                ans[i] = Math.min(ans[i], primes[j] * ans[index[j]]);
            }
            for (int j=0; j<primes.length; j++) {
                while (primes[j]*ans[index[j]] <= ans[i] ) index[j]++;
            }
        }
        return ans[n-1];
    }
}