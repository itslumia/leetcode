/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int val = 0;
            if (l1 != null) val += l1.val;
            if (l2 != null) val += l2.val;
            val += carry;
            if (val > 9) {
                val -= 10;
                carry = 1;
            } else carry = 0;
            cur.next = new ListNode(val);
            cur = cur.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry == 1) cur.next = new ListNode(1);
        return head.next;
    }
}