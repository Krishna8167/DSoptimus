class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroup = dummy;

        while (true) {
            ListNode kth = prevGroup;
            for (int i = 0; i < k; i++) {
                kth = kth.next;
                if (kth == null) {
                    return dummy.next;
                }
            }

            ListNode groupHead = prevGroup.next;
            ListNode newHead = reverseSplit(groupHead, k);

            prevGroup.next = newHead;
            prevGroup = groupHead; // groupHead is now tail
        }
    }

    public ListNode reverseSplit(ListNode node, int k) {
        ListNode previous = null;
        ListNode current = node;
        while (current != null && k > 0) {
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
            k--;
        }
        // node is now the tail
        node.next = current;
        return previous;
    }
}
