public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<Integer>());
        Arrays.sort(nums);
        for (int i : nums) {
            List<List<Integer>> list = new ArrayList<>();
            for (List<Integer> l : ans) {
                List<Integer> tmp = new ArrayList<>(l);
                tmp.add(i);
                list.add(tmp);
            }
            ans.addAll(list);
        }
        
        
        return ans;
    }
    
    
}