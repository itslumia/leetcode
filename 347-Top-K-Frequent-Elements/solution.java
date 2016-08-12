public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : nums) {
            if (!map.containsKey(i)) map.put(i, 1);
            else {
                int p = map.get(i);
                map.put(i, p+1);
            };
        }
        for (int key : map.keySet()) {
            pq.offer(map.get(key));
            if (pq.size() > k) pq.poll();
        }
        int value = pq.peek();
        for (int key : map.keySet()) {
            if (map.get(key) >= value) ans.add(key);
        }
        return ans;  
    }
}