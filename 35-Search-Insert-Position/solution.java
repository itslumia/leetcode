public class Solution {
    public int searchInsert(int[] nums, int target) {
        int s = 0;
        int e = nums.length-1;
        while (s<e) {
            int m = s + (e-s)/2;
            if (target <= nums[m]) e=m;
            else s=m+1;
        }
        if (nums[s] >= target) return s;
        else return s+1;
    }
}