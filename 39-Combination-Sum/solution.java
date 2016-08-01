public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates, 0, target, new ArrayList<Integer>(), ans);
        return ans;
    }
    
    private void helper(int[] n, int index, int t, List<Integer> list, List<List<Integer>> ans) {
        if (t == 0) ans.add(new ArrayList<Integer> (list));
        else if (t > 0) {
            for (int i=index; i<n.length && t >= n[i]; i++) {
                list.add(n[i]);
                helper(n, i, t-n[i], list, ans);
                list.remove(list.size()-1);
            }
        }
    }
}