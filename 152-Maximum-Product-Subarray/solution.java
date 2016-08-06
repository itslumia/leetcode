public class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;
        int maxPre = nums[0];
        int minPre = nums[0];
        int max = nums[0];
        int maxHere, minHere;
        for (int i=1; i<nums.length; i++) {
            maxHere = Math.max(Math.max(maxPre * nums[i], minPre * nums[i]), nums[i]);
            minHere = Math.min(Math.min(maxPre * nums[i], minPre * nums[i]), nums[i]);
            max = Math.max(maxHere, max);
            maxPre = maxHere;
            minPre = minHere;
        }
        return max;
    }
}