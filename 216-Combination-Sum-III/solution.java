public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(k,n,1,ans, new ArrayList<Integer>());
        return ans;
    }
    
    private void helper(int times, int sum, int start, List<List<Integer>> ans, List<Integer> list) {
        //if (sum <= 0) return;
        if (times == 0) {
            if (sum == 0 && !ans.contains(list)) ans.add(new ArrayList<Integer>(list));
        } else {
            for (int i=start; i<=9; i++) {
                list.add(i);
                helper(times-1, sum-i, i+1, ans, list);
                list.remove(list.size()-1);
            }
        }
    }
}