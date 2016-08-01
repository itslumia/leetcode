public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] m = new int[n][n];
        int rs = 0;
        int re = n-1;
        int cs = 0;
        int ce = n-1;
        int k=1;
        while (rs <= re && cs <= ce) {
            for (int i=cs; i<=ce; i++) m[rs][i] = k++;
            rs++;
            for (int i=rs; i<=re; i++) m[i][ce] = k++;
            ce--;
            if (rs <= re) {
                for (int i=ce; i>=cs; i--) m[re][i] = k++;
                re--;
            }
            if (cs <= ce) {
                for (int i=re; i>=rs; i--) m[i][cs] = k++;
                cs++;
            }
        }
        return m;
    }
}