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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode Prevmid = middle(head);
        ListNode mid = Prevmid.next;
        Prevmid.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return mergeSort(left, right);
    }

    public ListNode mergeSort(ListNode a, ListNode b) {
        ListNode headpoint = new ListNode();
        ListNode head = headpoint;

        while (a != null && b != null) {
            if (a.val < b.val) {
                head.next = a;
                a = a.next;
            } else {
                head.next = b;
                b = b.next;
            }
            head = head.next;
        }

        if (a != null) head.next = a;
        if (b != null) head.next = b;

        return headpoint.next;
    }

    public ListNode middle(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        return prev;

    }
}
