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
class Problem24SwapNodesInPairs {

    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode start = new ListNode(-1);
        start.next = head;

        ListNode pointer = start;

        while (pointer != null && pointer.next != null && pointer.next.next != null) {

            ListNode a = pointer.next;
            ListNode b = pointer.next.next;

            a.next = b.next;
            b.next = a;

            // observer pointre now set at b, to look for next 2 nodes
            pointer.next = b;
            pointer = a;
        }

        return start.next;
        
    }
}
