/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = head;
        ListNode c = head.next;
        while (c != null) {
            if (c.val == p.val) c = c.next;
            else {
                p.next = c;
                p = c;
                c = c.next;
            }
        }
        p.next = c;
        return head;
        
    }
}