public class Solution {
    public int removeDuplicates(int[] nums) {
        int length = 1;
        if (nums.length < 3) return nums.length;
        int c = 1;
        boolean twice = false;
        for (int i=1; i<nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                if (!twice) {
                    nums[c] = nums[i];
                    c++;
                    length++;
                    twice = true;
                }
            } else if (nums[i] != nums[i-1]) {
                nums[c] = nums[i];
                c++;
                length++;
                twice = false;
            }
        }
        return length;
    }
}