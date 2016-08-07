/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode cur = head.next;
        ListNode sortedHead = head;
        ListNode sortedTail = head;
        while (cur != null) {
            if (cur.val >= sortedTail.val) sortedTail = sortedTail.next;
            else if (cur.val <= sortedHead.val) {
                sortedTail.next = cur.next;
                cur.next = sortedHead;
                sortedHead = cur;
            } else {
                ListNode key = sortedHead;
                sortedTail.next = cur.next;
                while (key != null && key.next.val < cur.val) key = key.next;
                cur.next = key.next;
                key.next = cur;
                
            }
            cur = sortedTail.next;
        }
        return sortedHead;
    }
}