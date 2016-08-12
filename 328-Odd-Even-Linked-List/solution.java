/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) return head;
        ListNode oddHead = head;
        ListNode oddTail = head;
        ListNode evenHead = head.next;
        ListNode evenTail = head.next;
        ListNode cur = head.next.next;
        int index = 3;
        while (cur != null) {
            //ListNode tmp = cur.next;
            if (index%2 == 1) {
                oddTail.next = cur;
                oddTail = oddTail.next;
            } else {
                evenTail.next = cur;
                evenTail = evenTail.next;
            }
            cur = cur.next;
            index++;
        }
        oddTail.next = evenHead;
        evenTail.next = null;
        return head;
    }
}