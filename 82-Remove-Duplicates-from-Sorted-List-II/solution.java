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
        ListNode dummy = new ListNode(-1);
        if (dummy.val == head.val) dummy.val++;
        dummy.next = head;
        ListNode p = dummy;
        ListNode f = head;
        ListNode s = head.next;
        while (s != null) {
            if (f.val != p.val && f.val != s.val) {
                p.next = f;
                p = p.next;
            }
            
            while (s != null && f.val == s.val) {
                f = f.next;
                s = s.next;
            }
            f = f.next;
            if (s != null) s = s.next;
        }
        p.next = f;
        return dummy.next;
        
        
        
    }
}