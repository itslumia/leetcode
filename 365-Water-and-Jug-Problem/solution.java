public class Solution {
    public boolean canMeasureWater(int x, int y, int z) {
        if (z > x+y) return false;
        if (z == x || z == y || z == x+y) return true;
        return z%GCD(x, y) == 0;
    }
    
    private int GCD(int x, int y) {
        while (y != 0) {
            int tmp = y;
            y = x%y;
            x = tmp;
        }
        return x;
    }
}