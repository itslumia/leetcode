public class Solution {
    class Num {
        int row;
        int col;
        int val;
        Num(int row, int col, int val) {
            this.row = row;
            this.col = col;
            this.val = val;
        }
    }
    
    class ComNum implements Comparator<Num> {
        public int compare(Num n1, Num n2) {
            return n1.val - n2.val;
        }
    }
    
    public int kthSmallest(int[][] matrix, int k) {
        int ans = -1;
        if (matrix.length == 0 || matrix[0].length == 0) return ans;
        PriorityQueue<Num> pq = new PriorityQueue(k, new ComNum());
        for (int i=0; i<matrix[0].length && i<k; i++) pq.offer(new Num(0, i, matrix[0][i]));
        for (int i=1; i<=k && !pq.isEmpty(); i++) {
            Num n = pq.poll();
            ans = n.val;
            if (n.row < matrix.length-1) pq.offer(new Num(n.row+1, n.col, matrix[n.row+1][n.col]));
        }
        return ans;
    }
}