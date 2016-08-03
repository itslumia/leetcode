public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> ans = new ArrayList<>();
        int l = s.length();
        if (l<4 || l>12) return ans;
        divide(s, 4, ans, "", 0);
        return ans;
    }
    
    private void divide(String s, int piece, List<String> ans, String p, int index) {
        if (piece == 0) {
            if (index == s.length()) ans.add(p.substring(0,p.length()-1));
        } else {
            char c1 = index >= s.length()? 'a':s.charAt(index);
            char c2 = index+1 >= s.length()? 'a':s.charAt(index+1);
            char c3 = index+2 >= s.length()? 'a':s.charAt(index+2);
            int key = -1;
            if (c1 != 'a' && c2 != 'a' && c3 != 'a') {
            	key = 100 * (c1 - '0') + 10 * (c2 - '0') + (c3 - '0');
            }
            if (c1 != 'a') {
                String np1 = p + c1 + ".";
                divide(s, piece-1, ans, np1, index+1);
            }
            if (c2 != 'a' && c1 != '0') {
                String np2 = p + c1 + c2 + ".";
                divide(s, piece-1, ans, np2, index+2);
            }
            if (c3 != 'a' && c1 != '0' && key > 0 && key < 256) {
                String np3 = p + c1 + c2 + c3 + ".";
                divide(s, piece-1, ans, np3, index+3);
            }
        }
        
    }
}