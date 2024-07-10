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
    public ListNode deleteMiddle(ListNode head) {
        // Edge case: if the list has only one node or is empty, return null
        if (head == null || head.next == null) {
            return null;
        }

        // Initialize pointers
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        // Use the two-pointer technique to find the middle node
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Remove the middle node
        if (prev != null) {
            prev.next = slow.next;
        }

        return head;
    }
}
