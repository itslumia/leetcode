public class Solution {
    public int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i=2; i<n; i++) {
            if (!notPrime[i]) {
                count++;
                for (int j=2; i*j < n; j++) {
                    notPrime[i*j] = true;
                }
            }
        }
        return count;
    }
    //no use, just leave it here
    private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i=2; i*i<n; i++) {
            if ((n % i) == 0) return false;
        }
        return true;
    }
}