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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        int length = 1;
        ListNode tail = head;
        ListNode newtail = head;

        //Length of the linkedlist.
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        //if k does multiple rotations.
        k = k % length;
        if (k == 0 ) {
            return head;
        }

        tail.next = head;


        for (int i = 1; i < (length - k); i++) {
            newtail = newtail.next;
        }

        ListNode newhead = newtail.next;

        newtail.next = null;

        return newhead;
    }
}
