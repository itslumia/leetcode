public class Solution {
    public int reverse(int x) {
        boolean f = (x<0)?true:false;
        if (f) x=-x;
        int y=0;
        while (x>0) {
            if ((Integer.MAX_VALUE - x%10)/10 < y) return 0;
            y = y*10 + x%10;
            x/=10;
        }
        if (f) y=-y;
        return y;
    }
}