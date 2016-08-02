/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        int length = 0;
        ListNode l = head;
        if (head == null) return head;
        while (l != null) {
            l=l.next;
            length++;
        }
        k = k % length;
        ListNode slow = head;
        ListNode fast = head;
        while (k>0) {
            fast = fast.next;
            k--;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = head;
        head = slow.next;
        slow.next = null;
        return head;
        
    }
}