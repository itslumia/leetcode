public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int s = 0;
        int e = nums.length-1;
        int[] ans = new int[2];
        while (s < e) {
            int m = s + (e - s) / 2;
            if (nums[m] >= target) e = m;
            else s = m+1;
        }
        if (nums[s] != target) {
            ans[0] = -1;
            ans[1] = -1;
            return ans;
        }
        ans[0] = s;
        s = 0;
        e = nums.length-1;
        target++;
        while (s < e) {
            int m = s + (e - s) / 2;
            if (nums[m] >= target) e = m;
            else s = m+1;
        }
        if (nums[s] >= target) ans[1] = s-1;
        else if (nums[s] < target) ans[1] = s;
        else ans[1] = s;
        return ans;
    }
}