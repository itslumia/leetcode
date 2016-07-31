public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> pre = new ArrayList<>();
        if (n == 0) return pre;
        for (int i=1; i<=n; i++) {
            if (i == 1) pre.add("()");
            else {
                List<String> cur = new ArrayList<>();
                for (String s : pre) {
                    for (int j=0; j<s.length(); j++) {
                        if (s.charAt(j) == ')') {
                            String tmp = s.substring(0, j) + "()" + s.substring(j);
                            if (!cur.contains(tmp)) cur.add(tmp);
                        }
                    }
                    String tmp = s += "()";
                    if (!cur.contains(tmp)) cur.add(tmp);
                }
                pre = cur;
            }
        }
        return pre;
    }
}