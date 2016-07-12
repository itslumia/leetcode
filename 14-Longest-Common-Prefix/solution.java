public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length==0) return "";
        for (int i=0; i<strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j=1; j<strs.length; j++) {
                if (i >= strs[j].length() || c != strs[j].charAt(i)) {
                    if (i != 0) return strs[0].substring(0,i);
                    if (i == 0) return "";
                }
            }
        }
        return strs[0];
        
    }
}