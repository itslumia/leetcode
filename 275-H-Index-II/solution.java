public class Solution {
    public int hIndex(int[] citations) {
        int l = citations.length;
        if (l==0) return 0;
        if (l==1) return citations[0]>=1 ? 1 : 0;
        int s = 0;
        int e = l-1;
        while (s<=e) {
            int m = s + (e-s)/2;
            int v = l - m;
            if (citations[m] >= v) e=m-1;
            else s=m+1;
        }
        return l-e-1;
    }
}