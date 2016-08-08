public class Solution {
    public List<String> summaryRanges(int[] nums) {
        Arrays.sort(nums);
        List<String> ans = new ArrayList<>();
        if (nums.length == 0) return ans;
        int s = 0;
        int e = 0;
        for (int i=1; i<=nums.length; i++) {
            if (i < nums.length && nums[i] == nums[i-1] + 1) e++;
            else {
                if (e == s) {
                    String str = ""+nums[s];
                    ans.add(str);
                    s = i;
                    e = i;
                } else {
                    String str = nums[s] + "->" + nums[e];
                    ans.add(str);
                    s = i;
                    e = i;
                }
            }
        }
        return ans;
        
    }
}