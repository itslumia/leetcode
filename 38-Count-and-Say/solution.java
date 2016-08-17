public class Solution {
    public String countAndSay(int n) {
        String s = "1";
        String ans = "";
        if (n == 1) return s;
         for (int i=2; i<=n; i++) {
        	ans = "";
        	int count = 1;
        	char say = s.charAt(0);
        	if (s.length() == 1) {
        		ans += count;
        		ans += say;
        		s = ans;
        		continue;
        	}
        	for (int j = 0; j < s.length()-1; j++) {
        		count = 1;
        		say = s.charAt(j);
        		while (j < s.length()-1 && s.charAt(j+1) == say) {
        			j++;
        			count++;
        		}
        		ans += count;
        		ans += say;
        	}
        	if (s.charAt(s.length()-1) != s.charAt(s.length()-2)) {
        		ans += "1";
        		ans += s.charAt(s.length()-1);
        	}
        	s = ans;
        }
        return ans;
    }
}