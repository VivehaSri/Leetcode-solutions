class Solution {
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        head = reverse(head);
        if (n == 1) {
            head = head.next;
        } else {
            ListNode temp = head;
            for (int i = 1; i < n - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        head = reverse(head);
        return head;
    }
}
