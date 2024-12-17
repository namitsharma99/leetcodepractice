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
class Problem2095DeleteTheMiddleNodeOfALinkedList {
    public ListNode deleteMiddle(ListNode head) {

        if(head == null || head.next == null)
            return null; // check till size = 1


        ListNode slow = head;
        ListNode fast = head.next.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = slow.next.next; //bypassing middle

        return head;
        
    }
}
