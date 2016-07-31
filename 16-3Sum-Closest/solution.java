public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = 0;
        int close = Integer.MAX_VALUE;
        int ans = 0;
        for (int i=0; i<nums.length-2; i++) {
            if (i == 0 || nums[i] != nums[i-1]) {
                int j = i+1;
                int k = nums.length-1;
                while (j < k) {
                    sum = nums[i] + nums[j] + nums[k];
                    if (Math.abs(target - sum) < close) {
                        ans = sum;
                        close = Math.abs(target - sum);
                    }
                    if (sum == target) return sum;
                    else if (sum < target) j++;
                    else k--;
                }
            }
        }
        return ans;
    }
}