public class Solution {
    class Pair {
        int[] pair;
        int idx;
        int sum;
        Pair(int idx, int n1, int n2) {
            this.idx = idx;
            this.pair = new int[]{n1, n2};
            this.sum = n1 + n2;
        }
    }
    
    class ComPair implements Comparator<Pair> {
        public int compare(Pair p1, Pair p2) {
            return p1.sum-p2.sum;
        }
    }
    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<int[]> ans = new ArrayList<>();
        if (nums1.length == 0 || nums2.length == 0) return ans;
        PriorityQueue<Pair> q = new PriorityQueue(k, new ComPair());
        for (int i=0; i<nums1.length && i<k; i++) q.offer(new Pair(0, nums1[i], nums2[0]));
        for (int i=1; i<=k && !q.isEmpty(); i++) {
            Pair p = q.poll();
            ans.add(p.pair);
            if (p.idx < nums2.length-1) q.offer(new Pair(p.idx+1, p.pair[0], nums2[p.idx+1]));
        }
        return ans;
    }
}