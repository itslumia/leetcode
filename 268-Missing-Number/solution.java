public class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int i=0; i<nums.length; i++) sum+=nums[i];
        return sum(nums.length)-sum;
    }
    
    private int sum(int n) {
        int sum=0;
        for (int i=0; i<=n; i++) sum+=i;
        return sum;
    }
}