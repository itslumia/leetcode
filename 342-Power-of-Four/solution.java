public class Solution {
    public boolean isPowerOfFour(int num) {
        if (num < 0) return false;
        if ((num & (num-1)) != 0) return false;
        return (num & 0x55555555) != 0;
        //return num > 0 && (num&(num-1)) == 0 && (num & 0x55555555) != 0;
    }
}