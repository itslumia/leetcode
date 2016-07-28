/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode f = head;
        ListNode p = null;
        while (f != null) {
            ListNode s = f.next;
            f.next = p;
            p = f;
            f = s;
        }
        return p;
    }
}