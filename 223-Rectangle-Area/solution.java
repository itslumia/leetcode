public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int left = Math.max(A,E);
        int right = Math.min(C,G);
        int top = Math.min(D,H);
        int bottom = Math.max(B,F);
        int area1 = (C-A)*(D-B);
        int area2 = (G-E)*(H-F);
        int inter = 0;
        if (left < right && top > bottom) inter = (right - left) * (top - bottom);
        return area1+area2-inter;
    }
}