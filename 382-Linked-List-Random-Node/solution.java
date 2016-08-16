/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    ListNode head = null;
    Random randomGenerator = null;
    
    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    public Solution(ListNode head) {
        this.head = head;
        this.randomGenerator = new Random();
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
        ListNode ans = null;
        ListNode cur = head;
        for (int i=1; cur != null; i++) {
            if (randomGenerator.nextInt(i) == 0) ans = cur;
            cur = cur.next;
        }
        return ans.val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */