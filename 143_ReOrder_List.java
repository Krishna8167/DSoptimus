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
    public void reorderList(ListNode head) {
        ListNode previous = head;
        ListNode mid = middle(head);
        ListNode post = reverse(mid.next);
        mid.next = null;

        while (post != null) {
            ListNode temp1 = previous.next;
            ListNode temp2 = post.next;

            previous.next = post;
            post.next = temp1;

            previous = temp1;
            post = temp2;
        }
    }
    public ListNode middle (ListNode node) {
        ListNode fast = node;
        ListNode slow = node;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

     public ListNode reverse (ListNode node) {
        ListNode previous = null;
        ListNode current = node;

        while (current != null ) {
            ListNode next = current.next;   // next = next.next  may cause null pointerEXCEPTION.
            current.next = previous;
            previous = current;
            current = next; 
        }

        return previous;
    }

}
