public class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        //if (nums.length == 2)
        return Math.max(helper(nums, 0, nums.length-2), helper(nums, 1, nums.length-1));
    }
    
    private int helper(int[] nums, int s, int e) {
        if (e-s == 0) return nums[s];
        if (e-s == 1) return Math.max(nums[s],nums[e]);
        //if (e-s == 2) return Math.max(nums[0], nums[1]);
        int n_2 = nums[s];
        int n_1 = Math.max(nums[s], nums[s+1]);
        int n_3 = 0;
        for (int i=s+2; i<=e; i++) {
            n_3 = Math.max(n_1, n_2 + nums[i]);
            n_2 = n_1;
            n_1 = n_3;
        }
        return n_3;
    }
}