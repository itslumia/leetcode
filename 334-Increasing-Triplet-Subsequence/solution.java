public class Solution {
    public boolean increasingTriplet(int[] nums) {
        int small = Integer.MAX_VALUE;
        int big = Integer.MAX_VALUE;
        for (int i : nums) {
            if (i <= small) small = i;
            else if (i <= big) big = i;
            else return true;
        }
        return false;
    }
}