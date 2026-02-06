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
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middle(head);
        mid = reverse(mid);
        ListNode test = head; 

        while (mid != null ) {
            if (test.val == mid.val) {
                test = test.next;
                mid = mid.next;
            } else {
                return false;
            }
        }
        return true;
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

    public ListNode middle (ListNode node) {
        ListNode fast = node;
        ListNode slow = node;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
}
