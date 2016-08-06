public class Solution {
    public int findPeakElement(int[] nums) {
        int s=0;
        int e=nums.length-1;
        while (s<e) {
            int m=s+(e-s)/2;
            if (m==s) {
                if (nums[s]>nums[e]) return s;
                else return e;
            }
            if (nums[m]>nums[m-1] && nums[m]>nums[m+1]) return m;
            else if (nums[m-1]<nums[m] && nums[m]<nums[m+1]) s=m+1;
            else e=m-1;
        }
        return s;
    }
}