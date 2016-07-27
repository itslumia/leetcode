public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        if (numRows == 0) return ans;
        for (int i=0; i<numRows; i++) {
            if (i == 0) {
                List<Integer> tmp = new ArrayList<>();
                tmp.add(1);
                ans.add(tmp);
            } else if (i == 1) {
                List<Integer> tmp = new ArrayList<>();
                tmp.add(1);
                tmp.add(1);
                ans.add(tmp);
            } else {
                List<Integer> pre = ans.get(i-1);
                List<Integer> tmp = new ArrayList<>();
                tmp.add(1);
                for (int j=0; j<pre.size()-1; j++) {
                    tmp.add(pre.get(j)+pre.get(j+1));
                }
                tmp.add(1);
                ans.add(tmp);
            }
        }
        return ans;
    }
}