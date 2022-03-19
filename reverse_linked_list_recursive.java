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
    public ListNode reverseList(ListNode head) {
        ListNode h = head;
        if (head == null) return null;
        ListNode hNxt = head.next;
        ListNode temp = null;
        h.next = null;
        while (hNxt != null) {
            temp = h;
            h = hNxt;
            hNxt = hNxt.next;
            h.next = temp;
        }
        return h;
    }
}
