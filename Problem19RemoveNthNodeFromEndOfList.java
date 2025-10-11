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
class Problem19RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null || head.next ==  null) {
            return null;
        }

        ListNode slow = head, fast = head;

        // giving booster start to fast ptr to reach end keeping gap of n with the slow ptr.

        for (int i = 0; i< n; i++) {
            fast = fast.next;
        }

        // If fast becomes null, remove the head node | picked from suggestions in solution section
        if (fast == null) {
            return head.next;
        }


        while (fast.next != null) {
            slow = slow.next; // responsible for reaching the element to be deleted
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return head;
        
    }
}
