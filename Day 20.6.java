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
    public ListNode oddEvenList(ListNode head) {
        // Edge case: if the list is empty or has only one node, return the head
        if (head == null || head.next == null) {
            return head;
        }

        // Initialize pointers
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        // Traverse the list and rearrange nodes
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        // Connect the end of the odd list to the head of the even list
        odd.next = evenHead;

        return head;
    }
}
