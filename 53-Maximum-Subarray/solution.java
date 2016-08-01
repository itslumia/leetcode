public class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int maxHere = 0;
        for (int i=0; i<nums.length; i++) {
            maxHere = Math.max(nums[i], maxHere+nums[i]);
            max = Math.max(max, maxHere);
        }
        return max;
    }
}