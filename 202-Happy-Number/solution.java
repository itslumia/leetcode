public class Solution {
    public boolean isHappy(int n) {
        if (n == 0) return false;
        if (n == 1) return true;
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(n);
        int next = nextInt(n);
        while (set.add(next)) {
            if (next == 1) return true;
            next = nextInt(next);
        }
        return false;
        
    }
    
    int nextInt(int n) {
        int ans = 0;
        while (n > 0) {
            int a = n % 10;
            ans += Math.pow(a, 2);
            n /= 10;
        }
        return ans;
    }
}