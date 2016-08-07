public class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        helper(s, ans, new ArrayList<>());
        return ans;
    }
    
    private void helper(String s, List<List<String>> ans, List<String> list) {
        if (s.length() == 0) {
            ans.add(new ArrayList<>(list));
        } else {
            for (int i=1; i<=s.length();i++) {
                if (isPalin(s.substring(0, i))) {
                    list.add(s.substring(0, i));
                    helper(s.substring(i),ans,list);
                    list.remove(list.size()-1);
                }
            }
        }
    }
    
    private boolean isPalin(String s) {
        int begin = 0;
        int end = s.length()-1;
        while (begin<end) {
            if (s.charAt(begin) != s.charAt(end)) return false;
            begin++;
            end--;
        }
        return true;
    }
}