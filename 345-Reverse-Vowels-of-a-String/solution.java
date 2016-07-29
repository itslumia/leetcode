public class Solution {
    public String reverseVowels(String s) {
        int f = 0;
        int l = s.length()-1;
        char[] cs = s.toCharArray();
        while (f < l) {
            char p = cs[f];
            char q = cs[l];
            if (isV(p) && isV(q)) {
                char tmp = p;
                cs[f] = cs[l];
                cs[l] = tmp;
                f++;
                l--;
            } else if (isV(p)) {
                l--;
            } else if (isV(q)) {
                f++;
            } else {
                f++;
                l--;
            }
        }
        return new String(cs);
    }
    
    private boolean isV (Character c) {
        String v = "aeiouAEIOU";
        if (v.contains(c+"")) return true;
        return false;
    }
}