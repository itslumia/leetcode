public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums.length == 0) return ans;
        for (int i=0; i<=nums.length; i++) {
            if (i==0) ans.add(new ArrayList<>());
            else ans.addAll(combine(nums, i));
        }
        return ans;
    }
    
    private List<List<Integer>> combine(int[] n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        if (k < 1 || k > n.length) return ans;
        helper(ans, new ArrayList<Integer>(), 0, n, k);
        return ans;
    }
    
    private void helper(List<List<Integer>> ans, List<Integer> list, int start, int[] n, int count) {
        if (count == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        else {
            for (int i=start; i<n.length; i++) {
                list.add(n[i]);
                helper(ans, list, i+1, n, count-1);
                list.remove(list.size()-1);
            }
        }
    }
}