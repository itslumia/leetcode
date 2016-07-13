/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode p = dummy;
        ListNode f = head;
        ListNode s = head.next;
        while (s != null) {
            p.next = s;
            f.next = s.next;
            s.next = f;
            p = f;
            f = f.next;
            if (f == null) return dummy.next;
            else s = f.next;
        }
        return dummy.next;
        
    }
}