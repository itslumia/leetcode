public class Solution {
    public void wiggleSort(int[] nums) {
        final PriorityQueue<Integer> pq = new PriorityQueue<>();
        int k,s,e;
        int m = -1;
        boolean m2 = nums.length%2 == 0;
        if (m2) {
            k = nums.length/2;
            e = nums.length-2;
        } else {
            k = nums.length/2 +1;
            e = nums.length-1;
        }
        s = 1;
        int i=0;
        int sCount = 0;
        int eCount = 0;
        for (int val : nums) pq.offer(val);
        while (!pq.isEmpty()) {
            if(i<k) {
                nums[e] = pq.poll();
                e-=2;
                eCount++;
                i++;
            } else if (i == k) {
                m = pq.poll();
                while (!pq.isEmpty() && pq.peek() == m) pq.poll();
                i = k+1;
            } else {
                nums[s] = pq.poll();
                s+=2;
                sCount++;
            }
        }
        for (int idx=0; idx<nums.length; idx++) {
            if (idx%2 == 1) {
                if (idx >= s) nums[idx] = m;
            } else {
                if (idx <= e) nums[idx] = m;
            }
        }
        
    }
}