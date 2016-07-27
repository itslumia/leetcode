public class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        int n_2 = nums[0];
        int n_1 = Math.max(nums[0], nums[1]);
        int n_3 = 0;
        for (int i=2; i<nums.length; i++) {
            n_3 = Math.max(n_1, n_2 + nums[i]);
            n_2 = n_1;
            n_1 = n_3;
        }
        return n_3;
    }
}