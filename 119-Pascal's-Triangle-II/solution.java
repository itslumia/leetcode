public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j <= rowIndex; j++) {
            if (j == 0) ans.add(1);
            else if (j == 1) ans.add(1);
            else {
                List<Integer> tmp = new ArrayList<>();
                tmp.add(1);
                for (int i=0; i<ans.size()-1; i++) {
                    tmp.add(ans.get(i)+ans.get(i+1));
                }
                tmp.add(1);
                ans = tmp;
            }
        }
        return ans;
    }
}