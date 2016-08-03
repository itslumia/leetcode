public class Solution {
    public int numDecodings(String s) {
        if (s.length() == 0) return 0;
        int[] ans = new int[s.length()+1];
        ans[0] = s.charAt(0) == '0' ? 0 : 1;
        ans[1] = s.charAt(0) == '0' ? 0 : 1;
        for (int i=2; i<=s.length(); i++) {
            int n_2 = s.charAt(i-2)-'0';
            int n_1 = s.charAt(i-1)-'0';
            if (n_2 == 0 && n_1 == 0) return 0;
            else if (n_2 == 0) ans[i] = ans[i-1];
            else if (n_1 == 0) {
            	if (n_2 > 2) return 0;
            	else ans[i]=ans[i-2];
            }
            else if ((n_2*10 + n_1) <= 26) ans[i] = ans[i-1] + ans[i-2];
            else ans[i] = ans[i-1];
        }
        return ans[s.length()];
    }
}