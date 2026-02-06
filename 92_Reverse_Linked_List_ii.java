/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next ==  null) {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        // traverse to the point !st point of the reverse.
        for (int i = 0; i < left - 1; i++) {
            previous = current;
            current = current.next;
        }
        ListNode leftPrevious = previous;
        ListNode SublistTail = current;
        // previous is the point were the left is about to start.

        //Reverse to the point of the point of the the right and get next store the right + 1.

        for (int i = 0; i < (right - left) + 1; i++) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        //Reconnect.
        if (leftPrevious != null) {
            leftPrevious.next = previous;
        } else {
            head = previous;
        }

        SublistTail.next = current;

        return head;
    }
}
