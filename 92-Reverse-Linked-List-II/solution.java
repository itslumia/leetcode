/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode p = dummy;
        int k = 1;
        while (k<m) {
            p = p.next;
            k++;
        }
        ListNode f = p.next;
        ListNode s = f.next;
        while (k < n) {
            f.next = s.next;
            s.next = p.next;
            p.next = s;
            s = f.next;
            k++;
        }
        return dummy.next;
        
    }
}