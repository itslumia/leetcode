public class Solution {
    public boolean isUgly(int num) {
        if (num <= 0) return false;
        if (num == 1) return true;
        while (num%2 == 0 || num%3 == 0 || num%5 == 0) {
            if (num%2 == 0) num/=2;
            if (num%3 == 0) num/=3;
            if (num%5 == 0) num/=5;
        }
        if (num == 1) return true;
        return false;
    }
    
    private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i=2; i*i<n; i++) {
            if (n%i == 0) return false;
        }
        return true;
    }
}