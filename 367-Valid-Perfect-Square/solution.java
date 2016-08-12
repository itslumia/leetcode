public class Solution {
    public boolean isPerfectSquare(int num) {
        long r = num;
        while (r*r > num) r = (r + num/r)/2;
        int p = (int) r;
        return p*p==num;
    }
}