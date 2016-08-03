public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<Integer>());
        Arrays.sort(nums);
        for (int i : nums) {
            List<List<Integer>> list = new ArrayList<>();
            for (List<Integer> tmp : ans) {
                List<Integer> l = new ArrayList<>(tmp);
                l.add(i);
                if (!ans.contains(l)) list.add(l);
            }
            ans.addAll(list);
        }
        return ans;
    }
}