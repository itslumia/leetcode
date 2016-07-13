public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1) return nums.length;
        int c = 0;
        nums[c] = nums[0];
        for (int i=1; i<nums.length; i++) {
            if (nums[i] != nums[c]) nums[++c] = nums[i];
        }
        return ++c;
    }
}