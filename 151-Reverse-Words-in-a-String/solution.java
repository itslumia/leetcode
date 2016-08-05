public class Solution {
    public String reverseWords(String s) {
        String[] ss = s.trim().split("\\s+");
	    String ans = "";
	    for (int i=ss.length-1; i>0; i--) {
	    	ans += ss[i] + " ";
	    }
	    ans += ss[0];
	    return ans;
    }
}