public class Solution {
    public int StrStr(string haystack, string needle) {
        int h = haystack.Length;
        int n = needle.Length;
        if (h < n) return -1;
        if (n == 0) return 0;
        for (int i=0; i<=h-n; i++) {
            if (haystack.Substring(i, n).Equals(needle)) return i;
        }
        return -1;
    }
}