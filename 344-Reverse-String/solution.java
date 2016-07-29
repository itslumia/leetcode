public class Solution {
    public String reverseString(String s) {
        char[] cs = s.toCharArray();
        int f=0;
        int e=cs.length-1;
        while (f<e) {
            char tmp = cs[f];
            cs[f] = cs[e];
            cs[e] = tmp;
            f++;
            e--;
        }
        return new String(cs);
        
    }
}