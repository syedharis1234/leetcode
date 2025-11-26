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
    public ListNode removeElements(ListNode head, int val) {
        // Create a dummy node that points to the head of the list
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Use a current pointer starting from the dummy node
        ListNode current = dummy;

        // Traverse the linked list
        while (current.next != null) {
            if (current.next.val == val) {
                // Skip the node with the given value
                current.next = current.next.next;
            } else {
                // Move to the next node
                current = current.next;
            }
        }

        // Return the new head (skipping the dummy node)
        return dummy.next;
    }
}
