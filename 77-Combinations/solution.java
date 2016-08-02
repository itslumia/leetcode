public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        if (k < 1 || k > n) return ans;
        helper(ans, new ArrayList<Integer>(), 1, n, k);
        return ans;
    }
    
    private void helper(List<List<Integer>> ans, List<Integer> list, int start, int n, int count) {
        if (count == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        else {
            for (int i=start; i<=n; i++) {
                list.add(i);
                helper(ans, list, i+1, n, count-1);
                list.remove(list.size()-1);
            }
        }
    }
}