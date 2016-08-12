public class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        if (nums.length == 0) return ans;
        if (nums.length == 1) {
            ans.add(nums[0]);
            return ans;
        }
        Arrays.sort(nums);
        int[] parent = new int[nums.length];
        int[] count = new int[nums.length];
        int max = 0;
        int maxIdx = -1;
        for (int i = nums.length-1; i>=0; i--) {
            for (int j=i; j < nums.length; j++) {
                if (nums[j] % nums[i] == 0 && count[i] < 1+count[j]) {
                    count[i] = 1+count[j];
                    parent[i] = j;
                    if (count[i] > max) {
                        max = count[i];
                        maxIdx = i;
                    }
                }
            }
        }
        for (int i=0; i<max; i++) {
            ans.add(nums[maxIdx]);
            maxIdx = parent[maxIdx];
        }
        return ans;
    }
}