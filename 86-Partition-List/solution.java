/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = head;
        ListNode sh = null;
        ListNode st = null;
        ListNode lh = null;
        ListNode lt = null;
        while (cur != null) {
            if (cur.val < x) {
                if (sh == null) {
                    sh = cur;
                    st = cur;
                } else {
                    st.next = cur;
                    st = st.next;
                } 
            } else {
                if (lh == null) {
                    lh = cur;
                    lt = cur;
                } else {
                    lt.next = cur;
                    lt = lt.next;
                }
            }
            cur = cur.next;
        }
        if (st != null) st.next = lh;
        if (lt != null) lt.next = null;
        return sh==null?lh:sh;
    }
}